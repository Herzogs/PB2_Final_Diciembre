package ar.edu.unlam.pb2;

public class Persona {
	private String nom;
	private String ape;
	private Double peso;
	
	public Persona(String nom, String ape, Double peso) {
		this.nom = nom;
		this.ape = ape;
		this.peso = peso;
	}

	public String getNombre() {
		return nom;
	}

	public void setNombre(String nom) {
		this.nom = nom;
	}

	public String getApellido() {
		return ape;
	}

	public void setApellido(String ape) {
		this.ape = ape;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
}
