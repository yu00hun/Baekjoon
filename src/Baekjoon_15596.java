
public class Baekjoon_15596 {
	
    static long sum(int[] a) {
    	
        long ans = 0;
        
        for(int i=0; i<a.length; i++) {
            ans = ans + a[i];
        }
        
        return ans;
    }
    
//    public static void main(String[] args) {
//    	int[] a = {1,2,3};
//    	System.out.println(sum(a));
//    }
   
}
