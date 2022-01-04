package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Auto extends MedioTransporte implements Multeable {
	
	private String pat;
	private Integer cantidadMaximaDePasajeros;
	private Integer velocidadMaxima;
	private Integer velocidadActual;
	private Double pesoMaximoPermitido;
	private List<Infracciones> listaInfracciones;	
	private Set<Persona> ocup;
	
	

	public Auto(String pat,Integer maxPasajeros, Integer velMax, Double posX, Double posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
		this.pat = pat;
		this.velocidadMaxima = velMax;
		this.velocidadActual = 0;
		this.pesoMaximoPermitido = 0d;
		this.cantidadMaximaDePasajeros = maxPasajeros;
		this.listaInfracciones = new ArrayList<>();
		this.ocup = new HashSet<>();
	}
	
	public void agregarOcupante(Persona p) {
		this.ocup.add(p);
	}
	
	private Double getPesoTotalDeOcupantes() {
		Double pesoTotal = 0d;
		for (Persona persona : ocup) {
			pesoTotal += persona.getPeso();
		}
		return pesoTotal;
	}
	
	public String getPatente() {
		return this.pat;
	}
	
    public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}
    
    public Integer getVelocidadMaximaPermitida() {
		return velocidadMaxima;
	}
    
    public Integer getVelocidadActual() {
		return velocidadActual;
	}
    
    public void setPesoMaximoPermitido(Double pesoMaximoPermitido) {
		this.pesoMaximoPermitido = pesoMaximoPermitido;
	}
    
    public Double getPesoMaximoPermitido() {
		return pesoMaximoPermitido;
	}

    public void agregarInfraccion(Infracciones inf) {
    	this.listaInfracciones.add(inf);
    }

    @Override
	public Boolean superoVelocidadMaxima() throws VelocidadMaximaException {
		// TODO Auto-generated method stub
		if(this.listaInfracciones.contains(Infracciones.VELOCIDAD_EXCEDIDA))
			throw new VelocidadMaximaException("Superada la velocidad Maxima Permitida");
		return false;
	}

	@Override
	public Boolean superoPesoMaximoCarga() throws PesoMaximoException {
		// TODO Auto-generated method stub
		if(this.listaInfracciones.contains(Infracciones.PESO_EXCEDIDO))
			throw new PesoMaximoException("Se paso del Peso Maximo");
		return false;
	}

	@Override
	public Boolean cruzoEnRojo() throws NoRespetoSemaforoException {
		// TODO Auto-generated method stub
		if(this.listaInfracciones.contains(Infracciones.SEMAFORO_EN_ROJO))
			throw new NoRespetoSemaforoException("Cruzo El Semaforo en Rojo");
		return false;
	}

	@Override
	public Boolean estaEnRegla() throws FlojoDePapelesException {
		// TODO Auto-generated method stub
		if(this.listaInfracciones.contains(Infracciones.SIN_PAPELES))
			throw new FlojoDePapelesException("Flojo De Papel");
		return false;
	}

	@Override
	public Vehiculos getTipoDeVehiculo() {
		// TODO Auto-generated method stub
		return Vehiculos.AUTOS;
	}

}
