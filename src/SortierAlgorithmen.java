
public class SortierAlgorithmen {

	public static int[] bubbleSort(int[] array){
		int j = array.length - 2;
		boolean swap;
		do{
			swap = false;
			for(int n = 0; n <= j; n++){
				if(array[n] > array[n+1]){
					int helper = array[n];
					array[n] = array[n+1];
					array[n+1] = helper;
					
					swap = true;
				}
			}
			j--;
		}while(swap);
		
		return array;
	}
	
	
	public static int[] selectionSort(int[] array){
		int marker = array.length - 1;
		
		while(marker > 0){
			int maxPos = 0;
			
			for(int i = 1; i <= marker; i++){
				if(array[i] > array[maxPos]){
					maxPos = i;
				}
			}
			
			int helper = array[maxPos];
			array[maxPos] = array[marker];
			array[marker] = helper;
			
			marker--;
			
		}
		return array;
	}
	
	
	public static void main(String[] args) {
		final int[] toSort = {30, 70, 40, 80, 10, 60};
		
		int[] result = bubbleSort(toSort.clone());
		System.out.println("BubbleSort Ergebnis: ");
		for(int i : result){
			System.out.print(i + ", ");
		}
		System.out.println();
		
		result = selectionSort(toSort.clone());
		System.out.println("SelectionSort Ergebnis: ");
		for(int i : result){
			System.out.print(i + ", ");
		}

	}

}
