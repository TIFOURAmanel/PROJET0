package EXO1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	
	
	public static void saisieCorrecte () {
	
	int n ;
	System.out.print("veuillez saisir un entier : ");
	Scanner s = new Scanner (System.in) ;
	n = s.nextInt() ;
	System.out.println("le entier n = " + n);
	
}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		while (true ) {
		try {
			saisieCorrecte(); //si il ya une erreur dans la saisi il passe directement a catch
			break ;
		}
		
		catch( InputMismatchException  exp ) {
			System.out.println("Vous devez saisir un entier !");
			
		}
		}
	}

}
