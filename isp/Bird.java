//  Refactored Code
package com.condurance.isp;

// Bird only flies and runs, no barking
// Fix: Implements only the interfaces it needs
public class Bird implements Flyable, RunnableAnimal {
    @Override
    public void run() {
        System.out.print("Bird is running");
    }

    @Override
    public void fly() {
        System.out.print("Bird is flying");
    }
}
