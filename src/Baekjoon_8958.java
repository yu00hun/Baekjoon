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

/*
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
			
			String str[] = arr[j].split("");
			int score[] = new int[str.length];
			
			for(int k=0; k<str.length; k++) {
				if(str[k].equals("X")) score[k] = 0;
				else if (str[k].equals("O")) {
					if (k==0) score[k]=1;
					else score[k] += score[k-1] + 1;
				}
			}
			
			int sum = 0;
			for (int i=0; i<score.length; i++) {
				sum +=score[i];
			}
			
			System.out.println(sum);
		}
	}
}
*/
