import java.util.Scanner;

public class Baekjoon_4344 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt();
		double result;
		
		for(int i=0; i<c; i++) {
			
			int sum=0;
			int cnt=0;
			int n = scan.nextInt();
			int score[] = new int[n];
			
			for(int j=0; j<n; j++) {	
				score[j] = scan.nextInt();
				sum = sum + score[j];
			}
			for(int k=0; k<n; k++) {
				if(score[k] > (sum/n)) cnt++;
			}
			
			result = (double)cnt / n * 100;
			
			System.out.println(String.format("%.3f", result) + "%");
		}
	}

}
