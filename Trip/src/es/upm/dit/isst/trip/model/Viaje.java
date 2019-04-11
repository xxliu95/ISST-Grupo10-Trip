package es.upm.dit.isst.trip.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Viaje implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nViaje;

	private double presupuesto;
	@ManyToOne
	private Empleado viajero;
	@Temporal(TemporalType.DATE)
	private java.util.Date finicio;
	@Temporal(TemporalType.DATE)
	private java.util.Date ffin;

	private String descripcion;
	private int status;
	
	public Viaje() {}
	
	public Empleado getViajero() {
		return viajero;
	}

	public java.util.Date getFinicio() {
		return finicio;
	}

	public void setFinicio(java.util.Date finicio) {
		this.finicio = finicio;
	}

	public java.util.Date getFfin() {
		return ffin;
	}

	public void setFfin(java.util.Date ffin) {
		this.ffin = ffin;
	}

	public void setViajero(Empleado viajero) {
		this.viajero = viajero;
	}


	public int getnViaje() {
		return nViaje;
	}

	public void setnViaje(int nViaje) {
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

