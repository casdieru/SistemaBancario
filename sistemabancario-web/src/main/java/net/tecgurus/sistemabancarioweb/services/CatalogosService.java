package net.tecgurus.sistemabancarioweb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.tecgurus.sistemabancario.ws.client.Banco;
import net.tecgurus.sistemabancario.ws.client.CatalogoWS;
import net.tecgurus.sistemabancario.ws.client.CatalogoWSService;
import net.tecgurus.sistemabancario.ws.client.Usuario;


@Service
public class CatalogosService {
	
public List<Usuario> getAllUsuarios(){
	
	//Te da una interfaz y obtienes un puerto
	CatalogoWSService cs = new CatalogoWSService();
	
	//El puerto es el que hace la conexion
	CatalogoWS catalogoWS = cs.getCatalogoWSPort();
	
	return catalogoWS.getUsuariosByExample(5);
	
	}

public List<Banco> getAllBancos(){
	
	CatalogoWSService cs = new CatalogoWSService();
	
	CatalogoWS catalogoWS = cs.getCatalogoWSPort();
	
	return catalogoWS.getBancosByExample(5);	
	
	}

}
