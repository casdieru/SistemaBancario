package net.tecgurus.sistemabancarioweb.bean;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import net.tecgurus.sistemabancario.ws.client.Banco;

import net.tecgurus.sistemabancarioweb.services.CatalogosService;

@ManagedBean
@SessionScoped
public class BancosBean {
	
private List<Banco> tabla;
	
	@ManagedProperty("#{catalogosService}")
	private CatalogosService service; 
	
	public void consultar() {
		
		tabla = service.getAllBancos();
		
		String contextPath = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
		ExternalContext ex = FacesContext.getCurrentInstance().getExternalContext();
		try {
			ex.redirect(contextPath + "/pages/bancos.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	public List<Banco> getTabla() {
		return tabla;
	}

	public void setTabla(List<Banco> tabla) {
		this.tabla = tabla;
	}

	public CatalogosService getService() {
		return service;
	}

	public void setService(CatalogosService service) {
		this.service = service;
	}

}
