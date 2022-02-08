import java.util.Scanner;

public class Baekjoon_2577 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int result = a*b*c;
		
		int arr[] = new int[10];
		String str = Integer.toString(result);
		
		for(int i=0; i<str.length(); i++) {
			arr[(str.charAt(i))-48]++;
		}
		
		for(int j=0; j<10; j++) {
			System.out.println(arr[j]);
		}
	}

}
