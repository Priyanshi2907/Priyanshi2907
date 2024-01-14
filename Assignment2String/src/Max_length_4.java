
public class Max_length_4 {

	public static void main(String[] args) {
    String input="Hi How are you ";
    String[] sarray =input.split(" ");
	
    
    String maxstring=sarray[0];
    for(int i=1;i<sarray.length;i++) {
    	if (sarray[i].length()>maxstring.length()){
    		maxstring=sarray[i];
    	}
    }
    System.out.println(maxstring);

    }

}
////4) Find the substring which is having max length, if two strings lengths are equal
//return the first one.
//Sample input 1 : “Hi How are you”
//Sample output 1 : How
//Sample input 2 : “This is java String program ”
//Sample output 2 : program
