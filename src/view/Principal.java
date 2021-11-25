package view;

import controller.BubbleController;

public class Principal {
	public static void main (String[] args) {
		int[] vetor= {8,2,0,2,3,0,1};
		
		BubbleController bubble = new BubbleController();
		bubble.bubbleSort(vetor);		
	}
}
