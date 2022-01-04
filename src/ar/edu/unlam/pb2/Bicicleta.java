package ar.edu.unlam.pb2;

public class Bicicleta extends MedioTransporte {

	public Bicicleta(Double posX, Double posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vehiculos getTipoDeVehiculo() {
		// TODO Auto-generated method stub
		return Vehiculos.BICICLETAS;
	}
}
