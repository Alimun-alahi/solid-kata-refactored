package com.codurance.ocp;
//  Manager returns salary + bonus.
//  Previously: handled inside switch in Employee.
public class Manager extends Employee {

    Manager(int salary, int bonus) {
        super(salary, bonus);
    }

    @Override
    public int payAmount() {
        return salary + bonus;
    }
}
