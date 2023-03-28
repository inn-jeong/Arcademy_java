import java.util.ArrayList;
import java.util.Arrays;

public class ex {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] nums2 = {1,2,7,6,4};
	}
	public static int solution(int[] nums) {
        int answer = -1;
        int[] arr = new int[3];
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0) even.add(nums[i]);
            else odd.add(nums[i]);
        }
        if(even.size() >= 2) {
	        for(int i=0; i<even.size()-1; i++) {
	        	int cnt = 0;
	        	int prime_cnt = 0;
	        	int sum = 0;
	        	for(int j=i+1; j<even.size(); j++) {
	        		arr[cnt++] = even.get(i);
	        		arr[cnt++] = even.get(j);
	        		for(int k=0; k<odd.size(); k++) {
	            		if(cnt == 2) {
	            			arr[cnt++] = odd.get(k);
	            		}
	            	}
	        	}
	        	if(arr[2] == 0) break;
	        	sum = arr[0]+arr[1]+arr[2];
	        	if(sum%2!=0 && sum%3!=0) {}
	        }
        }
        else {
        	
        }
        

        return answer;
    }
	
}