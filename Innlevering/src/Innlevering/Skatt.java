package Innlevering;

import static javax.swing.JOptionPane.*;

public class Skatt {
	public static void main(String[] args) {
	String inntekt = showInputDialog("bruttoinntekt");
	int brutto = Integer.parseInt(inntekt);
	
	if (brutto >= 0)
	{
		if (brutto <= 164100) {
		System.out.println(brutto);
	}
	else if ((brutto > 164100) && (brutto <=230950))
	{
		double Trinn1 = (brutto*0.9907);
			System.out.println(Trinn1);
	}
	else if ((brutto > 230950) && (brutto <=580650))
	{
		double Trinn2 = (brutto*0.9759);
			System.out.println(Trinn2);
	}
	else if ((brutto > 580650) && (brutto <=934050))
	{
		double Trinn3 = (brutto*0.8848);
			System.out.println(Trinn3);
	}
	else
	{
		double Trinn4 = (brutto*0.8848);
			System.out.println(Trinn4);
	}
	

}}}