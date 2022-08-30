package carbuilder.director;

import carbuilder.builders.Builder;
import carbuilder.classes.CarType;
import carbuilder.components.Engine;
import carbuilder.components.GPSNavigator;
import carbuilder.components.Transmission;
import carbuilder.components.TripComputer;

public class Director {
	
	public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.CARRO_ESPORTIVO);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATICO);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CARRO_PASSEIO);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATICO);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }

}
