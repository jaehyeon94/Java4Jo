package Test_20210120;

public class SameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number_A = {1,2,3,4,5};
		int[] number_B = {1,2,3,4,5};
		int[] number_C = {1,2,3};
		boolean ck;
		
		int[] arr = {1,2,3,4,5};
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3};
		int[] arr3 = {1,2,3,4,5};
		int[] arr4 = null;
		int[] arr5 = null;
		
		
		
		Same same = new Same(number_A,number_B);
		ck = same.isSame();
		System.out.println(ck);
		same = new Same(number_A,number_C);
		ck = same.isSame();
		System.out.println(ck);
		
		System.out.println(same.equalsArray(arr, arr1));
		System.out.println(same.equalsArray(arr1, arr2));
		System.out.println(same.equalsArray(arr2, arr3));
		System.out.println(same.equalsArray(arr4, arr5));
		
		
	}

}
