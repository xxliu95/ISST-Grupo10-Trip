package es.upm.dit.isst.trip.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Viaje implements Serializable{
	
	@Id
	private String nViaje;
	
	private String descripcion;
	private int status;
	//private Date fechaComienzo; que clase date usar
	private int duracion; //en d��as
	private double presupuesto;
	/*
	 * @OneToMany(mappedBy = "viaje", fetch = FetchType.EAGER) private
	 * Collection<Factura> facturas;
	 */
	
	@ManyToOne
	private Empleado viajero;
	
	public Viaje() {}

	public String getnViaje() {
		return nViaje;
	}

	public void setnViaje(String nViaje) {
		this.nViaje = nViaje;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}


	public Empleado getEmpleado() {
		return viajero;
	}

	public void setEmpleado(Empleado empleado) {
		this.viajero = empleado;
	}
}

