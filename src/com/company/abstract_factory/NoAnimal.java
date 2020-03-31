package com.company.abstract_factory;

public class NoAnimal implements Animal {
    @Override
    public String getAnimal() {
        return "NoAnimal";
    }

    @Override
    public String makeSound() {
        return "NoSound";
    }
}
