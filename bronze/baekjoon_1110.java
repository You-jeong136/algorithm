import java.util.Scanner;

public class baekjoon_1110
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int origin = scan.nextInt();
	    int temp = origin;
	    int cnt = 0;
	   do {
	        temp = temp % 10 * 10 + (temp / 10 + temp % 10) % 10;
	        cnt++;
	    } while(origin != temp);
	    
	    System.out.print(cnt);
	    
	    scan.close();
	}
}