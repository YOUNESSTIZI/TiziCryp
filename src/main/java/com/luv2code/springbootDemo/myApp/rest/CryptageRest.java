package com.luv2code.springbootDemo.myApp.rest;

import java.util.Arrays;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springbootDemo.myApp.Repository.ICryptage;
import com.luv2code.springbootDemo.myApp.Repository.ICryptageImpl;
import com.luv2code.springbootDemo.myApp.entity.Frequence;

@RestController
public class CryptageRest {

	ICryptage crypt ;
	
	@CrossOrigin
	@GetMapping("crypt/{message}")
	public String cryptMessage(@PathVariable String message) {

		crypt = new ICryptageImpl(new Frequence());
		
		return "{" + '"' + "code" + '"' + ":" + '"' + crypt.crypt(message) + '"' + "}";
		
	}
	
	@CrossOrigin
	@GetMapping("decrypt/{message}")
	public String decryptMessage(@PathVariable String message) {

		crypt = new ICryptageImpl(new Frequence());
		
		return "{" + '"' + "code" + '"' + ":" + '"' + crypt.decrypt(Arrays.asList(message.split(" "))) + '"' + "}";
		
	}
	
	
	
	
}
