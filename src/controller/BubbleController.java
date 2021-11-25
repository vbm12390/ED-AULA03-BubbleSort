package controller;

public class BubbleController {
	
	public void bubbleSort(int[]vetor) {
		int tamanho = vetor.length;
		for (int i=0;i<tamanho;i++) {
			//System.out.println("Rodada ==> "+i+1);
			for (int j=0;j<tamanho -1;j++) {
				if(vetor[j]>vetor[j+1]) {
					int aux = vetor[j];
					vetor[j] =vetor[j+1];
					vetor[j+1]=aux;
				}
			}
			for (int j=0;j<tamanho;j++) {
				System.out.print(vetor[j]+" ");
			}
			System.out.println("Rodada ==> "+(i+1));
			System.out.println("");
		}
		
	}
}
