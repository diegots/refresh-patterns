package main.com.company;

import main.com.company.abstract_factory.AbstractFactory;
import main.com.company.abstract_factory.Animal;
import main.com.company.abstract_factory.Color;
import main.com.company.abstract_factory.FactoryProvider;
import main.com.company.command.OpenTextFileOperation;
import main.com.company.command.SaveTextFileOperation;
import main.com.company.command.TextFile;
import main.com.company.command.TextFileOperationExecutor;

public class Main {

    public static void main(String[] args) {

        // Run Abstract Factory
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

        // Run Command patters classes. Main class in this case is the consumer.
        TextFileOperationExecutor executor = new TextFileOperationExecutor();
        System.out.println(executor.executeOperation(new OpenTextFileOperation(new TextFile("fst.md"))));
        System.out.println(executor.executeOperation(new SaveTextFileOperation(new TextFile("snd.md"))));

        // Starting with Java 8 onwards an object-functional approach can be used:
        TextFileOperationExecutor functionalExecutor = new TextFileOperationExecutor();
        System.out.println(functionalExecutor.executeOperation(() -> "Opening file third.md"));
        System.out.println(functionalExecutor.executeOperation(() -> "Saving file fourth.md"));

        // Using method references
        TextFileOperationExecutor executorMetRef = new TextFileOperationExecutor();
        TextFile textFile = new TextFile("fifth.md");
        executorMetRef.executeOperation(textFile::open);
        executorMetRef.executeOperation(new TextFile("sixth.md")::save);
    }
}
