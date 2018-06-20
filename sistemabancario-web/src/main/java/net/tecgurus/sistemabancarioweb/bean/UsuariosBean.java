package net.tecgurus.sistemabancarioweb.bean;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import net.tecgurus.sistemabancario.ws.client.Usuario;
import net.tecgurus.sistemabancarioweb.services.CatalogosService;

@ManagedBean
@SessionScoped
public class UsuariosBean {
	
	private List<Usuario> tabla;
	
	@ManagedProperty("#{catalogosService}")
	private CatalogosService service; 
	
	public void consultar() {
		
		tabla = service.getAllUsuarios();
		
		String contextPath = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
		ExternalContext ex = FacesContext.getCurrentInstance().getExternalContext();
		try {
			ex.redirect(contextPath + "/pages/usuarios.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	public List<Usuario> getTabla() {
		return tabla;
	}

	public void setTabla(List<Usuario> tabla) {
		this.tabla = tabla;
	}

	public CatalogosService getService() {
		return service;
	}

	public void setService(CatalogosService service) {
		this.service = service;
	}

}
