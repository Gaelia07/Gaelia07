package com.poste.posteenrgy;


public class Message {
	@org.kie.api.definition.type.Label("message")
	private String message;
	@org.kie.api.definition.type.Label("status")
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
