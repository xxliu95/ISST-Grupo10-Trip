package es.upm.dit.isst.trip.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Viaje implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nViaje;
	
	private String destino;

	
	private double presupuesto;
	@ManyToOne
	private Empleado viajero;
	@Temporal(TemporalType.DATE)
	private java.util.Date finicio;
	@Temporal(TemporalType.DATE)
	private java.util.Date ffin;
	
	@OneToMany(mappedBy = "viaje", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private Collection<Factura> facturas;

	private String descripcion;
	private int status;
	
	public Viaje() {}
	
	public Empleado getViajero() {
		return viajero;
	}

	public Collection<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(Collection<Factura> facturas) {
		this.facturas = facturas;
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
	
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

}

