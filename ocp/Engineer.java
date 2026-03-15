package com.codurance.ocp;

//  Engineer only returns salary.
//  Previously: handled inside switch in Employee.
public class Engineer extends Employee {

    Engineer(int salary) {
        super(salary, 0);
    }

    @Override
    public int payAmount() {
        return salary;
    }
}
