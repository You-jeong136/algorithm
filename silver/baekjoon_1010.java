import java.util.Scanner;
public class Main
{
    static int [][] dp = new int[30][30];
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    for(int i = 0; i < t; i++){
	        int r = sc.nextInt();
	        int n = sc.nextInt();
	        
	        System.out.println(combi(n, r));
	        
	    }
	}
	
	static int combi(int n , int r){
	    if(dp[n][r] > 0){
	        return dp[n][r];
	    }
	    
	    if(r == 0 || n == r){
	        return dp[n][r] = 1;
	    }
	    
	    return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
	}
	
}