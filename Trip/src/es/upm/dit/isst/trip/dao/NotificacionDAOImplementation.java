package es.upm.dit.isst.trip.dao;

import java.util.Collection;

import org.hibernate.Session;

import es.upm.dit.isst.trip.model.Notificacion;

public class NotificacionDAOImplementation implements NotificacionDAO {
	private static NotificacionDAOImplementation instancia = null;
	private NotificacionDAOImplementation() {}
	public static NotificacionDAOImplementation getInstance() {
		if(instancia == null)
			instancia = new NotificacionDAOImplementation();
		return instancia;
}
	
	@Override
	public void create(Notificacion notificacion) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(notificacion);
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}		
	}

	
	@SuppressWarnings("finally")
	@Override
	public Notificacion read(int id) {
		Notificacion notificacion = null;
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			notificacion = session.load( Notificacion.class, id ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
			return notificacion;
		}
	}

	@Override
	public void update(Notificacion notificacion) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			session.saveOrUpdate( notificacion ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}		
	}

	@Override
	public void delete(Notificacion notificacion) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			session.delete( notificacion ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}			
	}

	@SuppressWarnings({ "finally", "unchecked" })
	@Override
	public Collection<Notificacion> readAll() {
		Session session = SessionFactoryService.get().openSession();
		Collection<Notificacion> notificaciones = null;
		try {
			session.beginTransaction(); 
			notificaciones = session.createQuery( "from Notificacion" ).list(); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
			return notificaciones;
		}	
	}
	
}