package Innlevering;

import static javax.swing.JOptionPane.showInputDialog;

public class Fakultet {
	public static void main(String[] args) {

	String A = showInputDialog("tall verdi");
	int Tall = Integer.parseInt(A);
	  while(Tall < 0) {
	        System.out.println("Tallet er ikkje gyldig");
	        System.out.println("Skriv inn ny verdi");
	        String B = showInputDialog("Tall verdi");
	        Tall = Integer.parseInt(B);
	  }
	  
	  int i,fact=1;  
	  int number=Tall; 
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Fakulteten av "+number+" er: "+fact);    
	  
}}
