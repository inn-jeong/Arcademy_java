
import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		int[] n = new int[10];
		int[] answer= {10};
		
		Arrays.sort(n);
	
		for(int i=0; i<n.length; i++) {
			if(i%2==0) {
				answer[i]= n[i]/2;
				
			}else if(i%2!=0) {
			    answer[i]=n[i]%2+1;
			
			}
			
			
			//뱨열은 크기를 못바꾸니까
			//홀수면 n/2값을 
			
		}
			
			
		
		
		
		
		
		
		
		
	}
}
