// Refactored Code (ISP applied)
package com.condurance.isp;

// Split into smaller, behavior-specific interfaces
// Fix: No animal is forced to implement methods it doesn't support
public interface Flyable {
    void fly();
}

