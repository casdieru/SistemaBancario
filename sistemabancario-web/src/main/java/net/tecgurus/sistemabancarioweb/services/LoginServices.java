/**
 * 
 */
package net.tecgurus.sistemabancarioweb.services;

import org.springframework.stereotype.Service;

import net.tecgurus.sistemabancario.ws.client.CatalogoWS;
import net.tecgurus.sistemabancario.ws.client.CatalogoWSService;

/**
 * @author cas_r
 *
 */
@Service
public class LoginServices {
	
	public Boolean validarLogin(String user, String password) {
		
		//Invoke WS client
		CatalogoWSService cs = new CatalogoWSService();
		
		CatalogoWS catalogoWS = cs.getCatalogoWSPort();
		
		System.out.println("invocar servicio " );
		return catalogoWS.login(password, user);
		
//		if(user.equals("DC")&& password.equals("123")) {
//			return true;
//		}else {
//			return false;
//		}
		
	}

}
