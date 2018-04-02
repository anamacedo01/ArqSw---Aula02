package br.usjt.arqsw.entity;

import java.io.Serializable;
/**
 * 
 * @author 816114287 - Ana Paula Silva de Macedo - SIN3AN MCA1
 */


public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	

	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
