
public class Increase_string_7 {

	public static void main(String[] args) {
		String input="Hello Java";
		String output=" ";
		StringBuffer result=new StringBuffer(output);
		for(char ch:input.toCharArray()) {
			if(Character.isLetter(ch)) {
				char newch=(char)(ch+1);
				result.append(newch);
			}
			else {result.append(ch);}
		}
		System.out.println("input:"+input);
		System.out.println("output4:"+result.toString().toLowerCase());
		
 	
	}

}
//Get the next character for each and every character of the given String
//Sample input : hello java
//Sample output: ifmmp kbwb




