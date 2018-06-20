package net.tecgurus.sistemabancarioweb.bean;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import net.tecgurus.sistemabancarioweb.services.LoginServices;

@ManagedBean
@SessionScoped
public class Login {
	
	private String usuario;
	private String pwd;
	
	@ManagedProperty("#{loginServices}")
	private LoginServices service;
	
	public void entrar() {
		
		if(service.validarLogin(usuario, pwd)) {
			
			String contextPath = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
			ExternalContext ex = FacesContext.getCurrentInstance().getExternalContext();
			try {
				ex.redirect(contextPath + "/pages/home.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		}else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_ERROR, "Usuario o contraseña incorrectos", null));
		}
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public LoginServices getService() {
		return service;
	}

	public void setService(LoginServices service) {
		this.service = service;
	}

}
