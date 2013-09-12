import java.util.Random;

public class mean{

	public static void main(String[] args) {
		int[] randomArray = makeRandom(1000, 100);
		System.out.println("the average of the array is");
		//System.out.println(mean(randomArray)+ ".");
		
		System.out.println("the average from index 40 to index 45 is ");
		System.out.println(meanOfRange(randomArray, 40 ,45) + ".");
	}

	public static double mean(int[] a){

	}

	public static double meanOfRange(int[] a, int start, int end){



	}

	public static int[] makeRandom(int size, int range){
		int[] a = new int[size];

		for (int i = 0; i <a.length; i++) {

			a[i] = r.nextInt(range + 1);
			
		}

		return a;

			}

}