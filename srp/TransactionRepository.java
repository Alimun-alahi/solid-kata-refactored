//  No Refactoring Needed
// Responsibility: Defines contract for storing and retrieving transactions.
// This is an abstraction with a single responsibility.
package com.codurance.srp;

import java.util.List;

public interface TransactionRepository {
    void add(Transaction transaction);
    List<Transaction> all();
}
