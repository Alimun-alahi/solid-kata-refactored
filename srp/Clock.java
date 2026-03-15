//  No Refactoring Needed
// Responsibility: Provides the current date.
// This class has a single, clear responsibility.
package com.codurance.srp;

import java.time.LocalDate;

public class Clock {
    public LocalDate today() {
        return LocalDate.now();
    }
}
