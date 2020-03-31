package main.com.company.abstract_factory;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String objectType) {
        if ("Yellow".equalsIgnoreCase(objectType)) {
            return new Yellow();
        } else if ("Red".equalsIgnoreCase(objectType)) {
            return new Red();
        }

        return new NoColor();
    }
}
