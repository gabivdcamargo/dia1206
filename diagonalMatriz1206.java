package exerciciosMatriz;

import java.util.Scanner;

public class diagonalMatriz1206 {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		int m [][] = new int [4][4];
		
		for(int i=0; i<4; i++) {
				m[i][i] = (int) Math.round(Math.random()*100);
				
				for (int i1=0; i1<4; i1++) { 
					for(int j=0; j<4; j++) {
					System.out.println("Os valores são " + m[i1][j]);
			}
		}
		ler.close();

	}

	}
}
