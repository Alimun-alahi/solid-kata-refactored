// ✅ New Interface to follow DIP
package com.codurance.dip;

// Abstraction for sending messages
// Fix: BirthdayGreeter now depends on this interface, not a concrete class
public interface MessageSender {
    void send(Email email);
}
