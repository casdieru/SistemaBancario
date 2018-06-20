/**
 * 
 */
package net.tecgurus.sistemabancario_ws.webservices;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.tecgurus.sistemabancario_ws.beans.Banco;
import net.tecgurus.sistemabancario_ws.beans.Usuario;
import net.tecgurus.sistemabancario_ws.services.BancoService;
import net.tecgurus.sistemabancario_ws.services.LoginService;
import net.tecgurus.sistemabancario_ws.services.UsuarioService;

/**
 * @author cas_r
 *
 */
@WebService
@Component("catalogoWS")
public class CatalogoWS {
	
	@Autowired
	private LoginService loginservice;
	
	@Autowired
	private UsuarioService usuarioServ;
	
	@Autowired
	private BancoService bancoServ;
	
	@WebMethod
	public Boolean login(@WebParam(name="password") String password, @WebParam(name="usuario") String usuario) {
		
		System.out.println("Validar usuario desde WS...");
		
		return usuarioServ.consultarLogin(usuario, password);
	}
	
	@WebMethod
	public List<Usuario> getUsuariosByExample(@WebParam(name="noUsuarios")Integer noUsuarios){
		
		System.out.println("Generando usuarios desde WS...");
		
		return usuarioServ.generarUsuario();
		
	}
	
	@WebMethod
	public List<Banco> getBancosByExample(@WebParam(name="noBancos") Integer noBancos){
		
		System.out.println("Generando bancos desde WS...");
		
		return bancoServ.generarBanco(noBancos);
		
	}

	/**public LoginService getLoginservice() {
		return loginservice;
	}

	public void setLoginservice(LoginService loginservice) {
		this.loginservice = loginservice;
	}

	public UsuarioService getUsuarioServ() {
		return usuarioServ;
	}

	public void setUsuarioServ(UsuarioService usuarioServ) {
		this.usuarioServ = usuarioServ;
	}*/

	@WebMethod
	public Boolean crearUsuario(@WebParam(name="usuario")Usuario usuarioDto) {
		return usuarioServ.crearUsuario(usuarioDto);
		
	}
	
	@WebMethod
	public Boolean actualizarUsuario(@WebParam(name="usuario")Usuario usuarioDto) {
		return usuarioServ.actualizarUsuario(usuarioDto);
		
	}
	
	@WebMethod
	public Boolean borrarUsuario(@WebParam(name="usuario")Usuario usuarioDto) {
		return usuarioServ.borrarUsuario(usuarioDto);
		
	}
	
	@WebMethod
	public Usuario consultarDetalleUsuario(@WebParam(name="idUsuario")Integer idUsuario) {
		return usuarioServ.consultarDetalleUsuario(idUsuario);
		
	}
	
}


















