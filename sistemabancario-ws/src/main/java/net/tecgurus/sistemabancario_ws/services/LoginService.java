/**
 * 
 */
package net.tecgurus.sistemabancario_ws.services;

import org.springframework.stereotype.Service;

/**
 * @author cas_r
 *
 */
@Service
public class LoginService {
	
	public Boolean doLogin(String pwd, String us) {
		return (pwd.equals("123") && us.equals("Diego")) ? true:false;
		
	}

}
