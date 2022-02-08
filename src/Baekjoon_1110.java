import java.util.Scanner;

public class Baekjoon_1110 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 0;
		int result = n;
		
		while(true) {
			if(result<10) {
				result = result*10 + result;
			} else {
				result = ((result%10)*10) + (((result/10)+(result%10))%10);
			}
			count++;
			if(result == n) break;
		}
		System.out.println(count);
	}

}
