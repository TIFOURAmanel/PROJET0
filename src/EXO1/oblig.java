package EXO1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Excep extends Exception {
	
	private String msg = "ERREUR , le nbr < 10" ;

	public String getMsg() {
		return msg;
	}

	

	
	
	
}
public class oblig {

public static void saisieCorrecte () throws Excep {
		
		int n ;
		System.out.print("veuillez saisir un entier : ");
		Scanner s = new Scanner (System.in) ;
		n = s.nextInt() ;
		if (n < 10) {
			  throw new Excep() ;
			  } 
		System.out.println("le entier n = " + n);
		
}
	  
	public static void main(String[] args) { 
		 
		try {
			saisieCorrecte();
			
		}
		
		catch( Excep  exp ) {
			System.out.println(exp.getMsg());
			
		}
		
		catch( InputMismatchException  exp ) {
			System.out.println("Vous devez saisir un entier !");
			
		}
		
	}
	
	
}
