package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class MedioTransporte {
	
	private Double posX;
	private Double posY;
	
	public MedioTransporte(Double posX, Double posY) {
		// TODO Auto-generated constructor stub
		this.posX = posX;
		this.posY = posY;
	}
	
	public Double getLatitud() {
		return posX;
	}
	
	public Double getLongitud() {
		return posY;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedioTransporte other = (MedioTransporte) obj;
		return Objects.equals(posX, other.posX) && Objects.equals(posY, other.posY);
	}

	public void actualizarCoordenadas(double d, double e) {
		this.posX = d;
		this.posY = e;
	}
	
	public Boolean existeColicion(MedioTransporte other) {
		return Objects.equals(posX, other.posX) && Objects.equals(posY, other.posY); 
	}
	
	public abstract Vehiculos getTipoDeVehiculo();
		

}
