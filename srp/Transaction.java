//  No Refactoring Needed
// Responsibility: Represents a financial transaction (date + amount).
// This class is cohesive and focused.
package com.codurance.srp;

import java.time.LocalDate;

public class Transaction {
    private LocalDate date;
    private int amount;

    Transaction(LocalDate date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate date() {
        return date;
    }

    public int amount() {
        return amount;
    }
}
