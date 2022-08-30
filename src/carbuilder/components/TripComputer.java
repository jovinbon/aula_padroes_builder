package carbuilder.components;

import carbuilder.classes.Car;

public class TripComputer {
	
	private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Nível de combustível: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Veículo ligado");
        } else {
            System.out.println("Veículo não ligado");
        }
    }

}
