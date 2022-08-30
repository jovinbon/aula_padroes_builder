package carbuilder.builders;

import carbuilder.classes.CarType;
import carbuilder.components.Engine;
import carbuilder.components.GPSNavigator;
import carbuilder.components.Transmission;
import carbuilder.components.TripComputer;

public interface Builder {
	
	void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
