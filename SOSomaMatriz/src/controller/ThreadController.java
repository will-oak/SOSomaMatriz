package controller;

public class ThreadController extends Thread {
	private int[] vetor;

	public ThreadController(int[] vetor) {
		this.vetor = vetor;
	}

	@Override
	public void run() {
		calcVetor();
	}
	
	private void calcVetor() {
		int aux = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			aux += vetor[i];
		}
		
		System.out.println("TID " +  getId() + " ==> " + aux);
	}
}
