import java.util.Scanner;
public class Beerbottlegame {

	public static void main(String[] args) {
		System.out.println("!!welcome to the beer bottle game!!");
		System.out.println("There are 21 beer bottles...");
		System.out.println("There are 2 players - Computer and you.");
		System.out.println("At a time, each one can pick up any no. of bottles");
		System.out.println("between 1 and 4 (inclusive)");
		int bottle=21;
		int compnumbottle=0;
        int usernumbottle=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Will you like to play first?");
		String option=sc.next();
		System.out.println(option);

		if (option.equals("yes") ||option.equals("YES")) //if user pick first
			//user chance
		 {
			System.out.println("user is playing");
			while(bottle>1) {
			System.out.println("How many you would like to pick up between 1 2,3,4 ?");
			do {
                usernumbottle=sc.nextInt();//user chance
                if (usernumbottle>4) {
        			System.out.println("please pick between 1-4");
        			continue;
                }
                else {
                	bottle=bottle-usernumbottle;
                	break;
                 }
            }while(bottle>1);
			
            //computer's chance
			if (bottle%2==0 && bottle >4) {
	            compnumbottle=3;
	            bottle=bottle-compnumbottle;
    			System.out.println("Computer has picked 3");
			}
			else if(bottle%2==0 && bottle <4) {
				compnumbottle=1;
	            bottle=bottle-compnumbottle;
    			System.out.println("Computer has picked 1");
			}
			else if(bottle%2!=0 && bottle >4) {
				compnumbottle=4;
	            bottle=bottle-compnumbottle;
    			System.out.println("Computer has picked 4");
			}
			else if(bottle%2!=0 && bottle <4) {
				compnumbottle=2;
	            bottle=bottle-compnumbottle;
    			System.out.println("Computer has picked 2");
			}
			else if (bottle==4) {
	            bottle=bottle-compnumbottle;
    			System.out.println("wohooo!! I have won");
			}
			System.out.println("The bottles remaining are:"+bottle);

          }
			System.out.println("You will have to pick the last!!1You are a loser");


		}
		else {
			//computer's chance come first
			System.out.println("Computer start first");
			while(bottle>1) {
			if (bottle%2!=0 && bottle >4) {
	            compnumbottle=4;
	            bottle=bottle-compnumbottle;
    			System.out.println("Computer has picked 4");
			}
			else if(bottle%2!=0 && bottle <4) {
				compnumbottle=2;
	            bottle=bottle-compnumbottle;
    			System.out.println("Computer has picked 2");
			}
			else if(bottle%2==0 && bottle >4) {
				compnumbottle=3;
	            bottle=bottle-compnumbottle;
    			System.out.println("Computer has picked 3");
			}
			else if(bottle%2!=0 && bottle <4) {
				compnumbottle=1;
	            bottle=bottle-compnumbottle;
    			System.out.println("Computer has picked 1");
			}
			else if (bottle==4) {
	            bottle=bottle-compnumbottle;
    			System.out.println("wohooo!! I have won");
			}
			//User's Chance
			System.out.println("The bottles remaining are:"+bottle);

			System.out.println("How many you would like to pick up between 1 2,3,4 ?");
			do {
                usernumbottle=sc.nextInt();//user chance
                if (usernumbottle>4) {
        			System.out.println("please pick between 1-4");
        			
                }
                else {
                	bottle=bottle-usernumbottle;
                	break;
                }
            }while(usernumbottle<4);
		}
			
		System.out.println("You will have to pick the last!!1You are a loser");
          		
	}

}
}
