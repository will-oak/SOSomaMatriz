package view;

import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		int[][] vetorNum = new int[5][3];

		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				int numero = (int) ((Math.random() * 100) + 1);
				vetorNum[l][c] = numero;
			}
		}

		ThreadController td1 = new ThreadController(vetorNum[0]);
		ThreadController td2 = new ThreadController(vetorNum[1]);
		ThreadController td3 = new ThreadController(vetorNum[2]);

		td1.start();
		td2.start();
		td3.start();

	}

}
