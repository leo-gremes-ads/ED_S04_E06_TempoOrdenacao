package view;

import lib.Sorting.Sorting;

public class Principal
{
	public static void main(String[] args)
	{
		Sorting sort = new Sorting();
		int[] merge = new int[1500],  bubble = new int[1500], quick = new int[1500];
		long inicio, fim;
		
		for (int i = 0; i < 1500; i++) {
			merge[i] = 1499 - i;
			bubble[i] = 1499 - i;
			quick[i] = 1499 - i;
		}
		
		//BUBBLE SORT
		inicio = System.nanoTime();
		bubble = sort.bubbleSort(bubble);
		fim = System.nanoTime();
		System.out.println("Tempo do Bubble Sort -> " + ((double)(fim - inicio)/1000000000) + "s");
		
		//MERGE SORT
		inicio = System.nanoTime();
		merge = sort.mergeSort(merge);
		fim = System.nanoTime();
		System.out.println("Tempo do Merge Sort  -> " + ((double)(fim - inicio)/1000000000) + "s");
		
		//QUICK SORT
		inicio = System.nanoTime();
		quick = sort.quickSort(quick);
		fim = System.nanoTime();
		System.out.println("Tempo do Quick Sort  -> " + ((double)(fim - inicio)/1000000000) + "s");
	}
}
