public class SSL_5 {
	
	public static void main(String[] args) {
		String input="Softra Services Limited";
		String output="";
		String[] str=input.split(" ");
		for (int i=0;i<str.length;i++) {
			char news=str[i].charAt(0);
			output=output+news;
		}
		System.out.println("Sample input:"+input);

		System.out.println("Sample output:"+output);
			
		}

}
