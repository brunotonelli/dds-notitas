package data;

import com.google.common.net.HttpHeaders;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

import domain.Estudiante;


import javax.ws.rs.core.MediaType;

public class ServiceNotitas {
	
	 private Client client;
	    private static final String API = "http://notitas.herokuapp.com";
	    private static final String TOKEN = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFI"
	    									+ "wN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";
	   
	    private static final String STUDENTS = "student";
	    private static final String ASSIGNMENTS = "student/assignments";

	    
	    public ServiceNotitas() {
	        this.client = Client.create();
	    }

	    public Estudiante getEstudiante(String legajo) {	    	
	    	ClientResponse response = this.client.resource(API).path(STUDENTS)
	    			.queryParam("q", "code:" + legajo)
	    			.header(HttpHeaders.AUTHORIZATION, TOKEN)
	                .accept(MediaType.APPLICATION_JSON)
	                .get(ClientResponse.class);
	    	
	    	if (response.getStatus() != 200) {
	    		throw new RuntimeException("Failed : HTTP error code : "
	    		+ response.getStatus());
	    	}

	    	String output = response.getEntity(String.class);
	    	return MapperNotitas.mapEstudiante(output);
	    }

}
