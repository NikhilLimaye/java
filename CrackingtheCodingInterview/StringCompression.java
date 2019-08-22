
public class StringCompression {

	public static void main(String[] args) {
		String input = "aaddddbd";
		System.out.println(compress(input));

	}

	private static String compress(String input) {
		
		StringBuilder s = new StringBuilder();
		char[] inputArray = input.toCharArray();
		int count = 0;
		for(int i = 0 ; i < inputArray.length ; i++) {
			count++;
			if(i+1 >= inputArray.length || inputArray[i+1] != inputArray[i]) {
				s.append(inputArray[i]);
				s.append(count);
				count=0;
			}
		}
		return s.toString().length() > input.length() ? input : s.toString();
		
	}

}
