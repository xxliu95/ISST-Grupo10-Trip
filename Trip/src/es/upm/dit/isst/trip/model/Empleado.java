package es.upm.dit.isst.trip.model;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class Empleado {
	
	@Id
	private String email;
	
	private String id;
	private String password;
	private String name;
	
	@OneToMany(mappedBy = "viajero", fetch = FetchType.EAGER)
	private Collection<Viaje> viajes;
	
	@OneToMany(mappedBy = "superior", fetch = FetchType.EAGER) 
	private Collection<Empleado> subordinados;
	
	@ManyToOne
	private Empleado superior;
	
	public Empleado() {}

	//getters y setters


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Collection<Viaje> getViajes() {
		return viajes;
	}


	public void setViajes(Collection<Viaje> viajes) {
		this.viajes = viajes;
	}


	public Collection<Empleado> getSubordinados() {
		return subordinados;
	}


	public void setSubordinados(Collection<Empleado> subordinados) {
		this.subordinados = subordinados;
	}


	public Empleado getSuperior() {
		return superior;
	}


	public void setSuperior(Empleado superior) {
		this.superior = superior;
	}






}
