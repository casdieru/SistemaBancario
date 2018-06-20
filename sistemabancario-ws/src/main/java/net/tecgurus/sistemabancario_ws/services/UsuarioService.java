/**
 * 
 */
package net.tecgurus.sistemabancario_ws.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.tecgurus.sistemabancario_ws.beans.Usuario;
import net.tecgurus.sistemabancario_ws.dao.UsuarioDao;



/**
 * @author cas_r
 *
 */

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	
	public List<Usuario> generarUsuario(){
			
	
		return usuarioDao.consultarUsuarios() ;
	}

	
	public Boolean consultarLogin(String user, String pwd) {
		
		return usuarioDao.consultarLogin(user, pwd);
		
	}
	
	public Boolean crearUsuario(Usuario usuarioDto) {
		return usuarioDao.insertarUsuario(usuarioDto);
		
	}
	
	public Boolean actualizarUsuario(Usuario usuarioDto) {
		return usuarioDao.updateUsuario(usuarioDto);
		
	}
	
	public Boolean borrarUsuario(Usuario usuarioDto) {
		return usuarioDao.deleteUsuario(usuarioDto);
		
	}
	
	public Usuario consultarDetalleUsuario(Integer idUsuario) {
		return usuarioDao.getUsuarioById(idUsuario);
		
	}

public UsuarioDao getUsuarioDao() {
	return usuarioDao;
}


public void setUsuarioDao(UsuarioDao usuarioDao) {
	this.usuarioDao = usuarioDao;
}

}

















