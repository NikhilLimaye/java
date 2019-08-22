
public class URLCreator {

	public static void main(String[] args) {
		
		String input = "Nik hil   ";
		int trueLength = 7;
		
		char[] charArr = input.toCharArray();
		int spaceCount = 0;
		
		for(int i = 0 ; i < trueLength ; i++ ) {
			if(charArr[i] == ' ')
				spaceCount++;
		}
		int index = trueLength + 2*spaceCount;
		
		for(int i = trueLength - 1 ; i>=0 ; i--) {
			if(charArr[i] == ' ') {
				charArr[index - 1] = '0';
				charArr[index - 2] = '2';
				charArr[index - 3] = '%';
				index = index - 3; 
			}
			else {
				charArr[index-1] = charArr[i];
				index--;
			}			
		}
		for(char a : charArr) {
			System.out.print(a);
		}
	}
}
