package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

			for (int i = 0; i < tabell.length; i++) {
				System.out.print(tabell[i]);}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tilStreng = ("[");
		if (tabell.length > 0) { 
		for (int i = 0; i < tabell.length-1; i++) {
			tilStreng += (tabell[i]+",");
			}	
		tilStreng+=tabell[tabell.length-1];
		tilStreng += ("]");
		}
		else {
			tilStreng += ("]");
		}
		return tilStreng;
		
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];}
		return sum;
		}
	

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet = false;
		int i = 0;
		
		while (!funnet && i < tabell.length) {
			if (tall == tabell[i]) {
				funnet = true;
			}
			i++;
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		boolean PosTall = false;
		for (int i=0;i<tabell.length;i++) {
			PosTall = tall == tabell[i];
			if (PosTall == true) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
    int[] reverser = new int[tabell.length];
    for (int i=0; i<tabell.length; i++) {
        reverser[i] = tabell[tabell.length - 1 - i];
    }
    return reverser;
		

		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean Sortert = true;
		int tall = 0;
		int ftall = 0;
		
		for (int i = 0; i<tabell.length && Sortert == true; i++) {
		
			tall = tabell[i];
			Sortert = tall>ftall;
			ftall = tall;
			
		}
			return Sortert;
		}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
	
		int[] NyTabell = new int [tabell1.length + tabell2.length];

		for (int i=0;i<tabell1.length;i++) {

			NyTabell[i]=tabell1[i];
		} 

		for (int i=0;i<tabell2.length;i++) {

			NyTabell[tabell1.length +i]=tabell2[i];

		}
		return NyTabell;
	}}
		
