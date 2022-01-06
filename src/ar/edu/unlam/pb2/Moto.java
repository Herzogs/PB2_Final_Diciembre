package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Moto extends MedioTransporte implements Multeable {

	private String pat;
	private final Integer CANTIDAD_MAXIMA_DE_PASAJEROS = 2;
	private Integer velocidadMaxima;
	private Integer velocidadActual;
	private Double pesoMaximoPermitido;
	private List<Infracciones> listaInfracciones;

	public Moto(String pat, Integer velMax,Double posX, Double posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
		this.pat = pat;
		this.velocidadMaxima = velMax;
		this.pesoMaximoPermitido = 200d;
		this.velocidadActual = 0;
		this.listaInfracciones = new ArrayList<>();
	}

	public String getPatente() {
		return this.pat;
	}
	
    public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CANTIDAD_MAXIMA_DE_PASAJEROS;
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
		return Vehiculos.MOTOS;
	}
}
