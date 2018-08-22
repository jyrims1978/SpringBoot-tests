package org.foo.bar.springrest;

public class ResponseEntity {
	
	private String response;
	

	public ResponseEntity(String response) {
		super();
		this.response = response;
	}


	public void setResponse(String response) {
		this.response = response;
	}


	public String getResponse() {
		return response;
	}
	

}
