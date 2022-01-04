package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Camion extends MedioTransporte implements Multeable{

	private String pat;
	private Integer pesoMax;
	private Integer velMax;
	private Integer velAct;
	private Integer pesoAct;
	private List<Infracciones> listaInfracciones;
	
	public Camion(String pat,Integer velMax, Integer pesMax, Double posX, Double posY) {
		// TODO Auto-generated constructor stub
		super(posX,posY);
		this.pat = pat;
		this.velMax = velMax;
		this.velAct = 0;
		this.pesoMax = pesMax;
		this.pesoAct = 0;
		this.listaInfracciones = new ArrayList<>();
	}
	
	public void agregarPeso(Integer p) {
		this.pesoAct += p;
	}
	
	public String getPatente() {
		return this.pat;
	}
	
    
    public Integer getVelocidadMaximaPermitida() {
		return velMax;
	}
    
    public Integer getVelocidadActual() {
		return velAct;
	}
    
    public void setPesoMaximoPermitido(Integer pesoMaximoPermitido) {
		this.pesoMax = pesoMaximoPermitido;
	}
    
    public Integer getPesoMaximoPermitido() {
		return pesoMax;
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
		return Vehiculos.CAMIONES;
	}

}
