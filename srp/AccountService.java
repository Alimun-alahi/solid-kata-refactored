package com.codurance.srp;
//  AccountService now only handles deposit/withdraw business logic.
//  Previously: It mixed business logic, formatting, and printing.
// Fix: Statement printing and formatting moved to StatementPrinter.
public class AccountService {

    private final TransactionRepository transactionRepository; // ✅ Persistence dependency
    private final Clock clock;                                 // ✅ Date provider dependency
    private final StatementPrinter statementPrinter;           // ✅ Dedicated printer dependency

    //  Constructor injection ensures flexibility and testability.
    //  Previously: AccountService directly used Console and formatting logic.
    //  Fix: Now it delegates to StatementPrinter.
    public AccountService(TransactionRepository transactionRepository, Clock clock, StatementPrinter statementPrinter) {
        this.transactionRepository = transactionRepository;
        this.clock = clock;
        this.statementPrinter = statementPrinter;
    }

    // Business logic only: deposit
    //  Previously: still fine, but cluttered by unrelated responsibilities.
    public void deposit(int amount) {
        transactionRepository.add(new Transaction(clock.today(), amount));
    }

    //  Business logic only: withdraw
    public void withdraw(int amount) {
        transactionRepository.add(new Transaction(clock.today(), -amount));
    }

    //  Delegates statement printing to StatementPrinter
    //  Previously: AccountService itself handled printing and formatting.
    public void printStatement() {
        statementPrinter.print(transactionRepository.all());
    }
}
