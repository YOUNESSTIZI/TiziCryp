package com.luv2code.springbootDemo.myApp.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;

import com.luv2code.springbootDemo.myApp.entity.Frequence;



public class ICryptageImpl implements ICryptage {

	private Frequence frequence ;
	private StringBuilder messageRecu;
	
	public ICryptageImpl(Frequence frequence) {
		super();
		this.frequence = frequence;
		this.messageRecu = new StringBuilder();
	}


	

	
	
	 /*
	  *  cette méthode retourne le message aprrès avoir décrypter la liste des mots
	  */  
	 
	@Override
	public String decrypt(List<String> code) {
		IntUnaryOperator trait = i->{ return (i-frequence.getFrequence())  ;};
		
		Consumer<String> decrypte = mot -> {mot.chars().map(trait).forEach(x->this.messageRecu.append((char)x));
											this.messageRecu.append(" ");};
		code.forEach(decrypte);
		
		String trace = messageRecu.toString(); // pour pouvoir vider le StringBuilder
		messageRecu.delete(0, messageRecu.length());
		
		return trace ;
	}
	
	
	
	
	/*
	* cette méthode retourne la liste des mots après le cryptage.
	 */
	@Override
	public String crypt(String message) { 
		
		List<String> cryptedList = new ArrayList<String>();
		
		for(String name : message.split(" ")) {
			
			StringBuilder nameCrypted = new StringBuilder();
			IntUnaryOperator trait = i->{ return (i+ frequence.getFrequence());};
			
			name.chars().map(trait).forEach(x->nameCrypted.append((char)x));
			
			cryptedList.add(nameCrypted.toString());
		}
		
		StringBuilder trace = new StringBuilder() ;
		
		cryptedList.forEach(x->{
			trace.append(x);
			trace.append(" ");
		}			
		);
		return trace.toString();
		
	}

}




















