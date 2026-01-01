package bubbleSort;

public class BubbleSorting {
	
	private int[] data;
	
	public BubbleSorting (int[] data) {
		this.data = data;
	}
		
	public void bubbleSort(int item ) {
	
		for(int j = 0; j<data.length-1; j++) {
			   for(int i = 0; i<data.length - 1 -j; i++) {
					if(data[i] > data[i+1]) {
						int temp = data[i];
						data[i] = data[i+1];
						data[i+1] = temp;
					}					
				}
				for (int k = 0; k < data.length; k++) {
					System.out.print(data[k]+ " ");
				}
				System.out.println();
		}	
	}
}

