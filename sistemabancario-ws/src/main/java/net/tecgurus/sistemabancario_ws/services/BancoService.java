package net.tecgurus.sistemabancario_ws.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.tecgurus.sistemabancario_ws.beans.Banco;

@Service
public class BancoService {
	
	public List<Banco> generarBanco(int cont){
		
		List<Banco> bancoList = new ArrayList<Banco>();
		
		for(int i = 0; i<cont; i++){
			
			Banco banco = new Banco();
			
			banco.setId("ID: " +i);
			banco.setNombre("NOMBRE: " +i);
			banco.setPais("PAIS: " +i);
			bancoList.add(banco);
			
		}
		
		return bancoList;
		
	}

}
