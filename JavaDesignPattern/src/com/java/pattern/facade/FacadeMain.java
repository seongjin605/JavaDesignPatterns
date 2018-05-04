package com.java.pattern.facade;

public class FacadeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv = new TV();
		Audio audio = new Audio();
		Light light = new Light();
		Home home = new Home(audio, light, tv);

		home.enjoyTv();
		home.enjoyMusic();
		home.goOut();
	}

}
