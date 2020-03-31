package com.company;

import com.company.abstract_factory.AbstractFactory;
import com.company.abstract_factory.Animal;
import com.company.abstract_factory.Color;
import com.company.abstract_factory.FactoryProvider;

public class Main {

    public static void main(String[] args) {

        // From https://www.baeldung.com/java-abstract-factory-pattern
        AbstractFactory<Animal> animalFactory = FactoryProvider.getFactory("Animal");
        Animal a1 =  animalFactory.create("Cat");
        System.out.println("This " + a1.getAnimal() + " makes " + a1.makeSound());
        Animal a2 =  animalFactory.create("Dog");
        System.out.println("This " + a2.getAnimal() + " makes " + a2.makeSound());

        AbstractFactory<Color> colorFactory = FactoryProvider.getFactory("Color");
        Color c1 = colorFactory.create("Yellow");
        System.out.println("First color is " + c1.getColor());
        Color c2 = colorFactory.create("Red");
        System.out.println("Second color is " + c2.getColor());
    }
}
