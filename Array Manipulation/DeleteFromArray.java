public class DeleteFromArray {
	static int count = 5;
	
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		
		DeleteFromArray obj = new DeleteFromArray();
		obj.print(a);
		
		/*
		obj.deleteFromEnd(a);
		obj.print(a); 

		obj.deleteValue(a, 30);
		obj.print(a); 
		
		obj.deleteFromPosition(a, 3);
		obj.print(a); 
		*/
	}
	
	public void deleteFromEnd(int[] a) {
		if(a.length <= 0) {
			return;
		}
		count--;
	}
	
	public void deleteValue(int[] a, int value) {
		int i;
		for (i = 0; i < count; i++) {
			if(a[i] == value) {
				break;
			}
		}
		
		if (i == count) {
			System.out.println("Value doesn't exist in array");
			return;
		}
		
		for (int j = i; j < count-1; j++) {
			a[j] = a[j+1];
		}
		count--;
	}
	
	public void deleteFromPosition(int[] a, int position) {
		if(position > count || position <= 0) {
			System.out.println("Invalid Postion");
			return;
		}
		for (int i = position-1; i < count-1; i++) {
			a[i] = a[i+1];
		}
		count--;
	}
	
	public void print(int[] a) {
		for(int i = 0; i < count; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
