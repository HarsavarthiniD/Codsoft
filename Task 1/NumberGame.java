import java.util.Scanner;
public class NumberGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int chances=8;
		int finalScore=0;
		boolean playAgain=true;
		System.out.print("Hey Buddy!, Welcome");
		System.out.println("You have "+chances+ "chances to win this game");
		while(playAgain) {
			int rand=getrandN(1,100);
			boolean guess=false;
			for(int i=0;i<chances;i++) {
				System.out.println("Please enter your guess "+(i+1)+":");
				int userGuess=sc.nextInt();
				if(userGuess==rand) {
					guess=true;
					finalScore+=1;
					System.out.println("You won it Buddy!");
					break;
				}else if(userGuess>rand) {
					System.out.println("Too High");
				}else {
					System.out.println("Too Low");
				}
			}
			if(guess==false) {
				System.out.println("Sorry Buddy, You lost the chances.");
				System.out.println("The number is "+rand);
			}
			System.out.println("Do you want to play again(y/n)");
			String pa=sc.next();
			playAgain=pa.equalsIgnoreCase("y");
		}
		System.out.println("That's it buddy, Hope you enjoyed playing this game.");
		System.out.println("Your Score is "+finalScore+".");
	}
	public static int getrandN(int min,int max) {
		return (int)(Math.random()*(max-min+1)-min);
	}
}
 