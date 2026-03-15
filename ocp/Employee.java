package com.codurance.ocp;
//  Fix: Remove switch logic and delegate pay calculation to polymorphism.
// Each employee type knows how to calculate its own pay.
public abstract class Employee {
    protected int salary;
    protected int bonus;

    Employee(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    //  Abstract method — subclasses implement their own pay logic.
    public abstract int payAmount();
}
