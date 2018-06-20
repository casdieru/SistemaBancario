package net.tecgurus.sistemabancarioweb.bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import net.tecgurus.sistemabancario.ws.client.Usuario;
import net.tecgurus.sistemabancarioweb.services.TestService;

@ManagedBean
@SessionScoped
public class LoginBeanFaces {
	
	
	private String saludo;
	private List<Usuario> tabla;
	
	@ManagedProperty("#{testService}")
	private TestService testTservice;
	
	public void saludar(){
		
		this.saludo = testTservice.sayHello("Jc");
		generarTabla();
		String contextPath = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
		ExternalContext ex = FacesContext.getCurrentInstance().getExternalContext();
		try {
			ex.redirect(contextPath + "/pages/home.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	
	public void generarTabla(){
		List<Usuario> tmp= new ArrayList<Usuario>();
		for(int i=0; i<5; i++){
			Usuario u = new Usuario();
			u.setId(i+"id");
			u.setNombre("Jc");
			u.setApellido("vm");
			tmp.add(u);
		}
		this.tabla=tmp;
	}
	
	
	public String getSaludo() {
		return saludo;
	}



	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}



	public TestService getTestTservice() {
		return testTservice;
	}

	public void setTestTservice(TestService testTservice) {
		this.testTservice = testTservice;
	}


	public List<Usuario> getTabla() {
		return tabla;
	}


	public void setTabla(List<Usuario> tabla) {
		this.tabla = tabla;
	}
	
	

}
