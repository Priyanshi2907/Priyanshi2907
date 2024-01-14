
public class remove_x_2 {

	public static void main(String[] args) {
		String input="abcxXXcxerxxXXwer";
        String output="";
		int count=0;
		StringBuffer sb=new StringBuffer(output);
		for(int i=0;i<input.length();i++) {
			char c=input.charAt(i);
			if(c!='x') {
				sb.append(c);
			}
			else {
			   count+=1;	
			}
		}
		for(int i=1;i<=count;i++) {
			sb.append("x");
		}
		System.out.println(sb);
		}
	}



//2) Remove all small ‘x’ and append at the end of the string
//Sample input : abcxXXcxerxxXXwer
//Sample output: abcXXcerXXwerxxxx