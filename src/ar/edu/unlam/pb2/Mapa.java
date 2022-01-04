package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Mapa {
	
	private String lug;
	private List<MedioTransporte> vehiculos;
	
	public Mapa(String lug) {
		this.lug = lug;
		this.vehiculos = new LinkedList<>();
	}
	
	public void agregarVehiculo (MedioTransporte tr) {
		this.vehiculos.add(tr);
	}
	
	public Integer getCantidadDeVehiculos() {
		return this.vehiculos.size();
	}
	
	public String getProvincia() {
		return lug;
	}
	
	public Boolean hayCoalicion() throws ColitionException{
		Boolean est = false;
		for (int i = 0; i < this.vehiculos.size(); i++) {
			for (int j = i+1; j < this.vehiculos.size(); j++) {
				if(this.vehiculos.get(i).existeColicion(this.vehiculos.get(j)).equals(true)) {
					throw new ColitionException("Existe Colicion");
				}
			}
		}
		
		return est;
	}
}
