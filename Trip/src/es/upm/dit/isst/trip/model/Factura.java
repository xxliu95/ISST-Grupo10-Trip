package es.upm.dit.isst.trip.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Factura implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nFactura;

	@Lob
	private byte[] documento;
	
	@ManyToOne 
	private Viaje viaje;
		
	public Factura() {}


	public int getnFactura() {
		return nFactura;
	}


	public void setnFactura(int nFactura) {
		this.nFactura = nFactura;
	}


	public byte[] getDocumento() {
		return documento;
	}

	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	
	

}
