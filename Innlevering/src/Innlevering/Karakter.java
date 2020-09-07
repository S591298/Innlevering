package Innlevering;

import static javax.swing.JOptionPane.showInputDialog;

public class Karakter {
	public static void main(String[] args) {
		
		final int Antall = 10;
		for (int elever = 1; elever <= Antall; elever++) {  
		
	
		    String A = showInputDialog("Poeng");
			int Poeng = Integer.parseInt(A);

		    while((Poeng > 100) || (Poeng < 0)) {
		        System.out.println("ERROR summen er ugyldig");
		        System.out.println("Skriv inn ny sum");
		        String B = showInputDialog("Poeng");
		        Poeng = Integer.parseInt(B);
		    }
		
		if (Poeng <= 39) {
			System.out.println("F");
		}
		else if ((Poeng > 39) && (Poeng <=49))
		{
				System.out.println("E");
		}
		else if ((Poeng > 49) && (Poeng <=59))
		{
				System.out.println("D");
		}
		else if ((Poeng > 59) && (Poeng <=79))
		{
				System.out.println("C");
		}
		else if ((Poeng > 79) && (Poeng <=89))
		{
				System.out.println("B");
		}
		else if ((Poeng > 89) && (Poeng <=100))
		{
				System.out.println("A");
		}
	
}}}
	