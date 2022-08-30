package carbuilder;

import carbuilder.builders.CarBuilder;
import carbuilder.builders.CarManualBuilder;
import carbuilder.builders.CarroBuilder;
import carbuilder.classes.Car;
import carbuilder.classes.CarType;
import carbuilder.classes.Manual;
import carbuilder.components.Engine;
import carbuilder.components.GPSNavigator;
import carbuilder.components.Transmission;
import carbuilder.director.Director;

public class Demo {

	public static void main(String[] args) {
		Director director = new Director();

        // O diretor obt�m o objeto construtor concreto do cliente
        // (application code). Isso porque o aplicativo sabe melhor qual
        // construtor usar para obter um produto espec�fico.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // O produto final geralmente � recuperado de um objeto construtor,
        // pois o Diretor n�o est� ciente e n�o depende de construtores e
        // produtos concretos.
        Car car = builder.getResult();
        System.out.println("Carro constru�do:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // O diretor pode conhecer v�rias receitas de constru��o.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nManual do carro constru�do:\n" + carManual.print());
        
        System.out.println();
        System.out.println("Construindo apenas um carro");
        
        Car carro = new CarroBuilder()
        		.type(CarType.CARRO_PASSEIO)
        		.engine(new Engine(1.4, 0))
        		.gpsNavigator(new GPSNavigator())
        		.transmission(Transmission.AUTOMATICO)
        		.build();
        
        System.out.println(carro.toString());
	}

}
