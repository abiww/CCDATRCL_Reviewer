
public class InsertElementInArray {
	int count = 0;
	
	 public static void main(String[] args) {
		 
		 InsertElementInArray arrays = new InsertElementInArray();

		//Insert an element in the array
		String[] names = {"Abigail", "Remy", "Caroline"};
		
		//Declare the length of array and adding the values
		String[] cars = new String[3];
		
		cars[0] = "Camaro";
		cars[1] = "Corvette";
		cars[2] = "Testa";

		int[] numbers = new int[5];
		
		//Using loop to insert values
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}
		
		//Using the method
		for (int i = 0; i < numbers.length; i++) {
			arrays.insert(numbers, i+1);
		}
		
		arrays.insertAtStart(numbers, 10);
		arrays.insertAtPosition(numbers, 3, 15);
	}
	 
	//Method to Print/Display
	public void print(int a[]) {
		//index or counter, condition, iteration (increment or decrement)
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	 }
	
	//Inserting Methods:
	public void insert(int a[], int val) {
		a[count++] = val;
	}
	
	public void insertAtStart(int a[], int val) {
		for (int i = a.length-1; i > 0; i--) {
			a[i] =a[i-1];
		}
		a[0] = val;
	}
	
	public void insertAtPosition(int a[], int position, int val) {
		for (int i = count-1; i > position; i--) {
			a[i] = a[i-1];
		}
		a[position] = val;
	}
}
