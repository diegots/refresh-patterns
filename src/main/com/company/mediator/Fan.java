package main.com.company.mediator;

public class Fan {

    private Mediator mediator;
    private boolean isOn = false;

    public Fan(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        mediator.stop();
        isOn = false;
    }
}
