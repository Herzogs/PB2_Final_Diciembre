package ar.edu.unlam.pb2;

public interface Multeable {

	public Boolean superoVelocidadMaxima() throws VelocidadMaximaException;
	public Boolean superoPesoMaximoCarga() throws PesoMaximoException;
	public Boolean cruzoEnRojo() throws NoRespetoSemaforoException;
	public Boolean estaEnRegla() throws FlojoDePapelesException;
}
