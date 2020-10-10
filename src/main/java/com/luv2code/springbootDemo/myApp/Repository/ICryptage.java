package com.luv2code.springbootDemo.myApp.Repository;

import java.util.List;

public interface ICryptage {
	
	public String crypt(String message);
	
	public String decrypt(List<String> code);
}
