import java.util.Scanner;

public class Pal{
	
	private String in; //The user's input 
	
	public Pal(String in){
		this.in = in;
	}
	
	public boolean check(String in){
		int l = in.length()-1; // index of user's string
		char start = in.charAt(0);
		char end = in.charAt(l-1);
	
		for(int i=0;i<l;i++){
			start = in.charAt(i);
			end = in.charAt(l-i);
			if(start!=end){
				System.out.println("Not a palindrome.");
				return false;
				}
		}
		return true;
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word or phrase: ");
		Pal pal = new Pal(scan.nextLine());
		System.out.println("");
		if(pal.check(pal.in))
			System.out.println("This is a palindrome.");
	}
}
