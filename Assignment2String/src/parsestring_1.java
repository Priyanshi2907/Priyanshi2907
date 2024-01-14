
public class parsestring_1 {

	public static void main(String[] args) {

	//1) Parse the String in the given format separated with ‘-’
	//Sample input : computer
	//Sample output : r-e-t-u-p-m-o-c
		
		String input = "computer";
		String output = "";
		
		StringBuffer sb=new StringBuffer(output);
		for(char c:input.toCharArray()) {
		     sb.append(c);
		     sb.append("-");
		}
		System.out.println(sb.deleteCharAt(sb.length()-1));
		

	}

}
