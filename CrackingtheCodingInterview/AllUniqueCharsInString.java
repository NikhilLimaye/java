
public class AllUniqueCharsInString {
	
	public static void main(String[] args) {
		
		String input = "Mongo";
		int[] alpha = new int[26]; 
		for(int i = 0 ; i < alpha.length ; i++) {
			alpha[i] = 1;
		}
		
		boolean result = true;
		input = input.toLowerCase();
		for(int j = 0 ; j < input.length() ; j++) {			
			if(alpha[input.charAt(j)-97] == 0) {
				result = false;
				break;
			}
			else {
				alpha[input.charAt(j)-97] = 0;
			}				
		}
		if(result)
			System.out.println("All unique characters");
		else
			System.out.println("Does not have all unique characters");
		
	}
	
}
