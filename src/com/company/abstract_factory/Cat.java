package com.company.abstract_factory;

public class Cat implements Animal {
    @Override
    public String getAnimal() {
        return "Cat";
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}
