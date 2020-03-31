package main.com.company.abstract_factory;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String objectType) {
        if ("Dog".equalsIgnoreCase(objectType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(objectType)) {
            return new Duck();
        } else if ("Cat".equalsIgnoreCase(objectType)) {
            return new Cat();
        }

        return new NoAnimal();
    }
}
