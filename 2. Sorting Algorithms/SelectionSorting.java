package selectionSort;

public class SelectionSorting {
	private int[] data;
	
	public SelectionSorting (int[] data) {
		this.data = data;
	}
	
	public void selectionsort() {
		for(int j = 0; j<data.length; j++) {
			
			int minIndex = j;
			
			for(int i = j+1; i<data.length; i++) {
				if(data[i]< data[minIndex]) {
					minIndex = i; 
				}
			}
			
			int temp = data[minIndex];
			data[minIndex] = data[j];
			data[j] = temp;
			
			for(int k = 0; k<data.length; k++) {
				System.out.print(data[k] +" ");
			}
			
			System.out.println();
		}
	}
}
