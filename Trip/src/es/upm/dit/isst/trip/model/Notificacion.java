package es.upm.dit.isst.trip.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.*;

@Entity
public class Notificacion implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nNotificacion;
	
	private String remitente;
	private String subject;
	private String msg;

	private boolean visto; //para saber si se ha leido o no

	@ManyToOne 
	private Empleado notificado;
	
	public Notificacion() {}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getnNotificacion() {
		return nNotificacion;
	}


	public void setnNotificacion(int nNotificacion) {
		this.nNotificacion = nNotificacion;
	}


	public Empleado getNotificado() {
		return notificado;
	}


	public void setNotificado(Empleado notificado) {
		this.notificado = notificado;
	}

	public String getRemitente() {
		return remitente;
	}


	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}


	public boolean isVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}	
	
	public void sendEmail(String subject,String msg) {
		
		this.msg = msg;
		this.subject = subject;
		//Detalle de los mensajes
	    String to = this.notificado.getEmail();
	      
	    //el siguiente email debe permitir aplicaciones no seguras
	    //cambiarlo desde la cuenta de gmail
	    //poner una cuenta y su contrasena
	    String from ="noreplyisstg10@gmail.com"; 
	    String password ="noreplyg10";
	 
	    //Ajuste de parametros especificos para gmail
	    Properties props = new Properties();  
	    props.setProperty("mail.transport.protocol", "smtp");     
	    props.setProperty("mail.host", "smtp.gmail.com");  
	    props.put("mail.smtp.auth", "true");  
	    props.put("mail.smtp.port", "465");  
	    props.put("mail.debug", "true");  
	    props.put("mail.smtp.socketFactory.port", "465");  
	    props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
	    props.put("mail.smtp.socketFactory.fallback", "false");  
	    Session session = Session.getDefaultInstance(props,  
	    new javax.mail.Authenticator() {
	       protected PasswordAuthentication getPasswordAuthentication() {  
	       return new PasswordAuthentication(from,password);  
	    }  
	    });  
	    //Transportar el mensaje
	    try {	  
	    	 Transport transport = session.getTransport();  
	    	 InternetAddress addressFrom = new InternetAddress(from);  

	    	 MimeMessage message = new MimeMessage(session);  
	    	 message.setSender(addressFrom);  
	    	 message.setSubject(subject);  
	    	 message.setContent(msg, "text/plain");  
	    	 message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));  

	    	 transport.connect();  
	    	 Transport.send(message);  
	    	 transport.close();
	    	   
	    } catch (MessagingException mex) {
	       mex.printStackTrace();
	    }
	 }
}