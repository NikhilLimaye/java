
public class EditsNeededString {

	public static void main(String[] args) {
		String s1 = "pale";
		String s2 = "paed";
		
		System.out.println(checkEdits(s1,s2));

				
	}

	private static boolean checkEdits(String s1, String s2) {
		
			
		int[] s1_alpha = new int[26];
		int[] s2_alpha = new int[26];
		
		char[] s1_arr = s1.toLowerCase().toCharArray();
		for(char t : s1_arr) {
			s1_alpha[t-97]++;
		}
		char[] s2_arr = s2.toLowerCase().toCharArray();
		for(char t : s2_arr) {
			s2_alpha[t-97]++;
		}
		int edits = 0;
		for(int i = 0 ; i < s1_alpha.length ; i++) {
			if(s1_alpha[i]!=s2_alpha[i])
				edits++;
			if(edits > 1)
				return false;
		}
	
		return true;
		
	}

}
