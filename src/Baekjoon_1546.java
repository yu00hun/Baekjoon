import java.util.Scanner;

public class Baekjoon_1546 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int score[] = new int[n];
		int max = 0;
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			score[i] = scan.nextInt();
		}
		
		for(int j=0; j<n; j++) {
			if(score[j] >= max) max = score[j];
		}
		
		for(int k=0; k<n; k++) {
			sum = sum + score[k];
		}
		System.out.println(sum*100/(n*max));
	}

}
