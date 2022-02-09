import java.util.Scanner;

public class Baekjoon_8958 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String arr[] = new String[n];

		for (int i=0; i<arr.length; i++) {
			arr[i] = scan.next();
		}
		
		for (int j=0; j<arr.length; j++) {
			
			int cnt = 0;
			int sum = 0;
			
			for(int k=0; k<arr[j].length(); k++) {
				if(arr[j].charAt(k)=='O') cnt++;
				else cnt = 0;
				sum = sum + cnt;
			}
			System.out.println(sum);
		}
	}
}
