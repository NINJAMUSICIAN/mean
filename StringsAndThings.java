public class StringsAndThings{
	
	public static void main(String[] args) {
	
		abcedarian("lovely");

	}

	public static boolean abcedarian(String s){

		int chr = 100;
		int result = 0;
		for(int i = 0; i < s.length; i++){
			result = s.charAt(i);

		}

		if (chr<result) {
			return false;
		}
		chr = result;
	}
}