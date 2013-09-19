import java.util.Arrays;

public class That {

	public static void main(String[] args) {
	int[] yes = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
	snake(yes);
	}

	public static void snake(int[] a){

		int length = a.length;
		int athird = length / 3;
		int[] first = new int[athird];
		int[] second = new int[athird];
		int[] third = new int[a.length - (athird * 2)];

		for (int i = 0; i < first.length; i++) {
			first[i] = a[i];
			System.out.println(first[i]);
		}
		
		for(int j = 0; j < second.length; j++){
			second[j] = a[(athird * 2) - j - 1];
			System.out.println(second[j]);
		}
		for(int x = 0; x < third.length; x++){
			third[x] = a[x + (athird * 2)];
			System.out.println(third[x]);
		}
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));
		System.out.println(Arrays.toString(third));
		
		
	}
}