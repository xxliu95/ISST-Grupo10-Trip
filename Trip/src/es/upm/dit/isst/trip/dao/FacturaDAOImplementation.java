package es.upm.dit.isst.trip.dao;

import java.util.Collection;

import org.hibernate.Session;

import es.upm.dit.isst.trip.model.Factura;
import es.upm.dit.isst.trip.model.Viaje;

public class FacturaDAOImplementation implements FacturaDAO{

	private static FacturaDAOImplementation instancia = null;
	private FacturaDAOImplementation() {}
	public static FacturaDAOImplementation getInstance() {
		if(instancia == null)
			instancia = new FacturaDAOImplementation();
		return instancia;
	}
	
	@Override
	public void create(Factura factura) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(factura);
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}		
	}

	@SuppressWarnings("finally")
	@Override
	public Factura read(int nViaje) {
		Factura factura = null;
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			factura = session.load( Factura.class, nViaje ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
			return factura;
		}
	}

	@Override
	public void update(Factura factura) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			session.saveOrUpdate( factura ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}		
	}

	@Override
	public void delete(Factura factura) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			session.delete( factura ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}			
	}

	@SuppressWarnings({ "finally", "unchecked" })
	@Override
	public Collection<Factura> readAll() {
		Session session = SessionFactoryService.get().openSession();
		Collection<Factura> facturas = null;
		try {
			session.beginTransaction(); 
			facturas = session.createQuery( "from Factura" ).list(); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
			return facturas;
		}	
	}

}
