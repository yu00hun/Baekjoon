import java.util.Scanner;

public class Baekjoon_10950 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int num1, num2;
		
		for(int i=0; i<count; i++) {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			System.out.println(num1 + num2);
			}
	}

}
