package com.codurance.dip;

import java.time.MonthDay;
import java.util.List;

public class BirthdayGreeter {
    private final EmployeeRepository employeeRepository; // Only responsible for fetching employees
    private final Clock clock;                           // Only responsible for providing today's date
    private final MessageSender messageSender;           // Depends on abstraction, not concrete class

    // Constructor injection ensures flexibility and testability
    public BirthdayGreeter(EmployeeRepository employeeRepository, Clock clock, MessageSender messageSender) {
        this.employeeRepository = employeeRepository;
        this.clock = clock;
        this.messageSender = messageSender;
    }

    public void sendGreetings() {
        MonthDay today = clock.monthDay(); // Delegates date responsibility to Clock
        List<Employee> employees = employeeRepository.findEmployeesBornOn(today); // Delegates data access to repository

        // Coordinates the process: builds emails and delegates sending to abstraction
        employees.stream()
                .map(this::emailFor)
                .forEach(messageSender::send);
    }

    private Email emailFor(Employee employee) {
        // Builds the birthday message — single responsibility
        String message = String.format("Happy birthday, dear %s!", employee.getFirstName());
        return new Email(employee.getEmail(), "Happy birthday!", message);
    }
}
