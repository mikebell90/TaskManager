package com.mjbkerry.taskmanager.domain;
/**
 * Represent the identity of someone. 
 * @author mjb
 *
 */
public class Identity {
	private String emailAddress;
	private String principal;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	
}
