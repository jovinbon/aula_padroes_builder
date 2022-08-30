package carbuilder.components;

import carbuilder.classes.Car;

public class TripComputer {
	
	private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("N�vel de combust�vel: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Ve�culo ligado");
        } else {
            System.out.println("Ve�culo n�o ligado");
        }
    }

}
