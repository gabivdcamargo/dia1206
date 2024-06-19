package exerciciosMatriz;

public class cruzMatriz1906 {

	public static void main(String[] args) {
		char matriz[][] = new char[5][5];
		for (int i=0; i<5; i++ ) {
			for (int j=0; j<5; j++) {
				if (i== 2 || j== 2) {
					matriz [i][j]= '*';
				} else {
					matriz[i][j]= ' ';

				}
			}
		}
		for (char[] l:matriz) {
			for (char c:l) {
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
