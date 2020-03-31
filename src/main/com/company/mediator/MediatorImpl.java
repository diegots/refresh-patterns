package main.com.company.mediator;

public class MediatorImpl implements Mediator {

    private Button button;
    private Fan fan;
    private PowerSupply powerSupply;

    @Override
    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    @Override
    public void start() {
        powerSupply.turnOff();
    }

    @Override
    public void stop() {
        powerSupply.turnOn();
    }
}
