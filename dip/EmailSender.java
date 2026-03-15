// ✅ Refactored to implement abstraction
package com.codurance.dip;

// Concrete implementation of MessageSender
// Fix: Handles only email sending, keeping single responsibility
public class EmailSender implements MessageSender {
    @Override
    public void send(Email email) {
        System.out.println("Sending email to " + email.getTo());
    }
}
