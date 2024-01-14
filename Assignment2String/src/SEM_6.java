
public class SEM_6 {

	public static void main(String[] args) {
		String input="Softra Services Limited";
		String output="";
		String[] str=input.split(" ");
		for (int i=0;i<str.length;i++) {
			char news=str[i].charAt(i);
			output=output+news;
		}
		System.out.println("Sample input:"+input);

		System.out.println("Sample output:"+output);
			
		}
		
		
	}


//6) Given input as : “Softra Services Limited” < first char from 1st word, 2nd char from
//second word, 3rd char from 3rd word etc.>> Output should be in capitals at the end.
//Output should be like: SEM
//str[0].charAt(0)+str[1].charAt(1)+str[2].charAt(2));
