package ar.edu.unlam.pb2;

public class Tren extends MedioTransporte {
	
	private Integer cantVag;
	private Integer cantPersXVagon;
	private Integer velMax;

	
	public Tren(Integer cantVag, Integer cantPersXVagon, Integer velMax,Double posX, Double posY) {
		super(posX, posY);
		this.cantVag = cantVag;
		this.cantPersXVagon = cantPersXVagon;
		this.velMax = velMax;
	}

	public Integer getCantidadDeVagones() {
		return this.cantVag;
	}
	
	public Integer getCantidadDePasajerosPorVagon() {
		return this.cantPersXVagon;
	}
	
	public Integer getVelocidadMaximaPermitida() {
		return this.velMax;
	}

	@Override
	public Vehiculos getTipoDeVehiculo() {
		// TODO Auto-generated method stub
		return Vehiculos.TRENES;
	}

}
