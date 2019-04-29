package es.upm.dit.isst.trip.model;

import java.util.Collection;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Empleado {
	
	@Id
	private String email;
	
	private String id;
	private String password;
	private String name;
	private boolean responsable;
	
	@Lob
	private byte[] foto;
	
	@OneToMany(mappedBy = "viajero", fetch = FetchType.EAGER)
	private Collection<Viaje> viajes;
	
	@OneToMany(mappedBy = "superior", fetch = FetchType.EAGER) 
	private Collection<Empleado> subordinados;
	
	@OneToMany(mappedBy = "notificado", fetch = FetchType.EAGER) 
	@Fetch(value = FetchMode.SUBSELECT)
	private Collection<Notificacion> notificaciones;
	
	@ManyToOne
	private Empleado superior;
	
	
	
	public Empleado() {}



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



	public boolean isResponsable() {
		return responsable;
	}



	public void setResponsable(boolean responsable) {
		this.responsable = responsable;
	}



	public byte[] getFoto() {
		return foto;
	}



	public void setFoto(byte[] foto) {
		this.foto = foto;
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

	//getters y setters
	
}
