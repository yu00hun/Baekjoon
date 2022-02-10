import java.util.Scanner;

public class Baekjoon_1065 {
	
	public static int result(int n) {
		int count = 0;
		
		if(n<100) {
			return n;
		} else {
			count = 99;
			
			for(int i=100; i<=n; i++) {
				int diff1 = i/100 - (i/10)%10;
				int diff2 = (i/10)%10 - i%10;
				if (diff1 == diff2) count++;
			}
			return count;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(result(n));
	}
}
