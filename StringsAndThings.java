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

	public static String captainCrunch(String s){
		String result = "";

		for (int i = 0; i < s.length();i++) {
			char c = s.charAt(i);
			char coded = (char)((int)c + 13);
			//check if coded is in proper range
			
			String str = "" + c;

			result = result + coded;
		}
		System.out.println(result);
		return result;		
	}

}