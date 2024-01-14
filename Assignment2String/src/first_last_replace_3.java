
public class first_last_replace_3 {

	public static void main(String[] args) {
		String input="hello World";
		String copyinput=input;
		String new1=copyinput.replace( "h","d");
		String new2=input.replace( new1.charAt(new1.length()-1), input.charAt(0));
		String result=new1+new2;
		String[] arr=result.split(" ");
		System.out.println("Input : "+input);

		System.out.println("Output: "+arr[0]+" "+arr[arr.length-1]);


        
		
	}

}


//3) Replace the first and last characters in the given string
//Sample input : Hello World
//Sample output: dello WorlH
