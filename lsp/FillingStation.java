//  Refactored Code
package com.codurance.lsp;

// FillingStation now works with abstractions directly
// Fix: No instanceof checks, respects LSP
public class FillingStation {

    public void refuel(FuelPowered vehicle) {
        vehicle.fillUpWithFuel();
    }

    public void charge(ElectricPowered vehicle) {
        vehicle.chargeBattery();
    }
}
