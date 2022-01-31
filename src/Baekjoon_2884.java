import java.util.Scanner;

public class Baekjoon_2884 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		
		if (minute >= 45) {
			System.out.print(hour + " ");
			System.out.print(minute - 45);
		} else {
			if(hour == 0) {
				hour = 24;
			}
			System.out.print(hour - 1 + " ");
			System.out.print(minute + 60 - 45);
		}
	}

}
