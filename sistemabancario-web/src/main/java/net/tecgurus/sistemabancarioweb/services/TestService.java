package net.tecgurus.sistemabancarioweb.services;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	public String sayHello(String name){
		return "hello "+name;
	}

}
