package com.encryptedconfigserverone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class StudentController {
	
	@Value("${username}")
	private String username;
	
	@Value("${url}")
	private String url;
	
	@Value("${password}")
	private String password;
	
	
	@GetMapping("/users")
	public String getUserDetails() {
		return "username :"+ username +"  url: "+url+" password: "+password;
	}
	
	

}
