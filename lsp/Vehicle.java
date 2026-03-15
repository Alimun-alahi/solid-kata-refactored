// Refactored Code
package com.codurance.lsp;

// Vehicle only defines common engine behavior
// Fix: Removed abstract fuel/charge methods — those belong to specialized interfaces
public abstract class Vehicle {

    private boolean engineStarted = false;

    public void startEngine() {
        this.engineStarted = true;
    }

    public boolean engineIsStarted() {
        return engineStarted;
    }

    public void stopEngine() {
        this.engineStarted = false;
    }
}
