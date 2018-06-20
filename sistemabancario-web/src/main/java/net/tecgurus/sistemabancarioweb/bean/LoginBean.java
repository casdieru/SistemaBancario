package net.tecgurus.sistemabancarioweb.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.tecgurus.sistemabancarioweb.services.TestService;

@Component
public class LoginBean {
	
	@Autowired
	private TestService testService;
	
	public void sayHiBean(String name){
		System.out.println(testService.sayHello(name));
	}
	

	public TestService getTestService() {
		return testService;
	}

	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	
	

}
