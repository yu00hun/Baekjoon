import java.util.Scanner;

public class Baekjoon_2562 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = 0;
		int num=0;
		
		for(int j=0; j<9; j++) {
			if (arr[j] > max) {
				max = arr[j];
				num = j+1;
			}
		}
		System.out.println(max);
		System.out.println(num);
	}
}
