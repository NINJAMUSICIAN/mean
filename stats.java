import java.util.Arrays;

public class Stats{

	public static void main(String[] args) {
		
		int[] yes = new int[]{1,2,3,4};
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

	public static double doubAverage(double[] a){

		double addition = 0;
		double numbers = 0;
		double average = 0;

		for (int i = 0; i < a.length; i++) {
			
			addition += a[i];
			numbers++;
		}

		average = addition / numbers;
		return average;
	}

	public static double median(int[] a){
		double median=0;
				Arrays.sort(a);

				if (a.length%2==0) {
					median = (a[a.length/2] + a[a.length/2 - 1]);
					median = median/2;
				} else {

					median = a[a.length/2];
				}
				return median;
			}

	public static double quartile1(int[] a){
		Arrays.sort(a);
		int total = a.length;
		int median = total / 2;
		int quartile = median / 2;

		double answer = 0;

		for(int i = 0; i < total; i++){

			answer = a[quartile];

		}
		
		return answer;
	}

	public static int mode(int[] a){

		int maxValue = 0, maxcounter = 0;

		    for (int i = 0; i < a.length; ++i) {
		        int totsbro = 0;
		        for (int j = 0; j < a.length; ++j) {
		            if (a[j] == a[i]) ++totsbro;
		        }
		        if (totsbro > maxcounter) {
		            maxcounter = totsbro;
		            maxValue = a[i];
		        }
		    }

		    return maxValue;
	} 

	public static double quartile3(int[] a){
		Arrays.sort(a);
		int total = a.length;
		int median = total/2;
		int quartile = median / 2;
		int quartill = median + quartile;

		double answer = 0;

		for(int i = 0; i < total; i++){
			answer = a[quartill];
		}

		return answer;
	}

	public static double standDev(int[] a) {
			double med = average(a);
			double[] differenceThing = new double[a.length];
			double standardDeviation = 0;

			for (int i=0; i<a.length; i++) {
				differenceThing[i] = (a[i] - med)*(a[i] - med);
			}

			standardDeviation = Math.sqrt(doubAverage(differenceThing));
			return standardDeviation;                                           
		}


}