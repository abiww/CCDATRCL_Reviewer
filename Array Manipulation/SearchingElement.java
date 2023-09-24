public class SearchingElement {
	
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		
		SearchingElement obj = new SearchingElement();
		int i = obj.searchIndex(a, 10);
		
		if (i == -1) {
			System.out.println("Value doesn't exist in array");
		} else {
			System.out.println(i);
		}
	}
	
	public int searchIndex(int[] a, int value) {
		if(a.length == 0) {
			return -1;
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
