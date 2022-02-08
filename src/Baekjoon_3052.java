import java.util.Iterator;
import java.util.Scanner;

public class Baekjoon_3052 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count[] = new int[42];
		int cnt=0;
		
		for(int i=0; i<10; i++) {
			count[scan.nextInt()%42]++;
		}
		
		for(int j=0; j<42; j++) {
			if(count[j] != 0) cnt++;
		}
		
		System.out.println(cnt);
	}

}
