import java.util.Arrays;

public class stats{

	public static void main(String[] args) {
		
		int[] yes = new int[]{3,2,48,97,84,462};
		median(yes);

	}

	public static int max(int[] a){
		int max = a[0];

		for(int i = 0; i < a.length; i++){

			if(a[i] > max){
				max = a[i];
			}
		}

		return max;

	}

	public static int min(int[] a){
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			
			if(a[i] < 0){
				min = a[i];
			}

		}
		return min;
	}

	public static double average(int[] a){

		int addition = 0;
		int numbers = 0;
		double average = 0;

		for (int i = 0; i < a.length; i++) {
			
			addition += a[i];
			numbers++;
		}

		average = addition / numbers;
		return average;
	}

	public static double median(int[] a){
		Arrays.sort(a);
		double median = 0;
		boolean even = false;

		if(a.length % 2 == 0){
			even = true;
		}
		if(even){
			median = a[a.length/2 + .5];
		}else{
			median = a[a.length/2 + 1];
		}
		System.out.println("median: " + median);

		return median;
	}

	public static double quartile1(int[] a){
		Arrays.sort(a);
		
	}

}