package insper.edu.br.Controller;

import java.util.Random;

public class RandChar {
	Random r = new Random();
	
	
	
	
	String alfabeto = "abcdefghijklmnopqrstuvwxyz";
	
	char simbl = alfabeto.charAt(r.nextInt(alfabeto.length()));
	
	public char getSimbol(){
		return simbl;
	}
	
	

		

}
