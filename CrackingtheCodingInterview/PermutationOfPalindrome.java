
import java.util.HashMap;

public class PermutationOfPalindrome {

	public static void main(String[] args) {
		
		String input = "tact coa";
		boolean result = true;
		HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
		int oddChar = 0;
		
		if(input.length()%2 == 0)
			oddChar = 1;
		else
			oddChar = 0;
		
		for(int i = 0 ; i < input.length() ; i++) {
			if(input.charAt(i) == ' ')
				continue;
			
			if(freqMap.containsKey(input.charAt(i))) {
				int value = freqMap.get(input.charAt(i));
				value++;
				freqMap.put( input.charAt(i), value);
			}
			else
				freqMap.put(input.charAt(i), 1);
		}
		
		for(Integer v : freqMap.values()) {
			System.out.println("v = "+v);
			if(v%2 == 0) 
				continue;
			else if(oddChar == 1)
				oddChar = 0;
			else {	
				result = false;
				break;
			}							
		}
		if(result)
			System.out.println("It is!");
		else
			System.out.println("It is not!");
	}

}
