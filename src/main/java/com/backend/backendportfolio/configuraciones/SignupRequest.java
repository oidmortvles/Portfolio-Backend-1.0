package com.backend.backendportfolio.configuraciones;
import java.util.Set;

import javax.validation.constraints.*;

public class SignupRequest {
	
	 @NotBlank
	  @Size(min = 3, max = 20)
	  private String username;

	  @NotBlank
	  @Size(max = 50)
	  @Email
	  private String mail;

	  private Set<String> role;

	  @NotBlank
	  @Size(min = 6, max = 40)
	  private String password;

	  public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }

	  public String getMail() {
	    return mail;
	  }

	  public void setMail(String email) {
	    this.mail = email;
	  }

	  public String getPassword() {
	    return password;
	  }

	  public void setPassword(String password) {
	    this.password = password;
	  }

	  public Set<String> getRole() {
	    return this.role;
	  }

	  public void setRole(Set<String> role) {
	    this.role = role;
	  }

}
