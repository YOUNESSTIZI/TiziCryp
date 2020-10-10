package com.luv2code.springbootDemo.myApp.entity;



public class Frequence {

	private int frequence = 1 ;
	
	public Frequence() {
		
	}
	
	public  Frequence(int frequence) {
		this.setFrequence(frequence);
	}
	
	
	
	
	public int getFrequence() {
		return this.frequence;
	}

	
	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}




	@Override
	public String toString() {
		return "IFrequenceImpl [frequence=" + frequence + "]";
	}
	
	

}
