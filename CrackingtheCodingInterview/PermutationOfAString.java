import java.util.Arrays;

public class PermutationOfAString {

	public static void main(String[] args) {
		
		String s1 = "abcd"; 
		String s2 = "bace";
		
		System.out.println(verifyStringPermutation(s1,s2));
	}

	private static boolean verifyStringPermutation(String s1, String s2) {
		
		if(s1.length()!=s2.length())
			return false;
		
		char[] cs1 = s1.toCharArray();
		char[] cs2 = s2.toCharArray();
		Arrays.sort(cs1);
		Arrays.sort(cs2);		
		for(int i = 0 ; i < cs1.length ; i++) {
			if(cs1[i] != cs2[i])
				return false;
		}
		return true;	
	}
	
	
}
