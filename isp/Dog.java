//  Refactored Code
package com.condurance.isp;

// Dog runs and barks, but does not fly
// Fix: Implements only RunnableAnimal and Barkable
public class Dog implements RunnableAnimal, Barkable {
    @Override
    public void run() {
        System.out.print("Dog is running");
    }

    @Override
    public void bark() {
        System.out.print("Dog is barking");
    }
}
