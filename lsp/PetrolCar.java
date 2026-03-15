//  Refactored Code
package com.codurance.lsp;

// PetrolCar only implements FuelPowered
// Fix: No meaningless chargeBattery() method
public class PetrolCar extends Vehicle implements FuelPowered {
    private static final int FUEL_TANK_FULL = 100;
    private int fuelTankLevel = 0;

    @Override
    public void fillUpWithFuel() {
        this.fuelTankLevel = FUEL_TANK_FULL;
    }

    public int fuelTankLevel() {
        return fuelTankLevel;
    }
}
