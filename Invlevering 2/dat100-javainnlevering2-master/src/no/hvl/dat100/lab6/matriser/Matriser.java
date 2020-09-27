package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] rad : matrise) {
			for(int x : rad) {
				System.out.println(x + " ");

			}
			System.out.println();
		}
	}
	// b)
	public static String tilStreng(int[][] matrise) {
		String matrise1 = "";
		for(int[] rad : matrise) {
			for(int element : rad) {
				matrise1 += Integer.toString(element) + " ";
			}
			matrise1 += "\n";
		}
		return matrise1;
	}
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
