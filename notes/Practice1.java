import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

	    Random rand = new Random();
	    int num = rand.nextInt(2)+3;

	    Scanner sc = new Scanner(System.in);
	    
	    for(int i=num; i!=0; i--) {		
		    System.out.format("Enter %d names: ", i);
		    System.out.println(sc.next());
	    }
    }
}
