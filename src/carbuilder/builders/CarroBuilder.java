package carbuilder.builders;

import carbuilder.classes.Car;
import carbuilder.classes.CarType;
import carbuilder.components.Engine;
import carbuilder.components.GPSNavigator;
import carbuilder.components.Transmission;
import carbuilder.components.TripComputer;

public class CarroBuilder {

	private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    
    public CarroBuilder type(CarType type) {
    	this.type = type;
    	return this;
    }
    
    public CarroBuilder seats(int seats) {
    	this.seats = seats;
    	return this;
    }
    
    public CarroBuilder engine(Engine engine) {
    	this.engine = engine;
    	return this;
    }
    
    public CarroBuilder transmission(Transmission transmission) {
    	this.transmission = transmission;
    	return this;
    }
    
    public CarroBuilder tripComputer(TripComputer tripComputer) {
    	this.tripComputer = tripComputer;
    	return this;
    }
    
    public CarroBuilder gpsNavigator(GPSNavigator gpsNavigator) {
    	this.gpsNavigator = gpsNavigator;
    	return this;
    }
    
    public Car build() {
    	return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

}
