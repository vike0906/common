package leetcode;


public class Solution {
	public int lengthOfLongestSubstring(String s) {
        int i = 0, j=1,z=0;
        while(i<s.length()&&j<=s.length()) {
        	if(j==s.length()) {
        		if(z<(j-i)) {
            		z=j-i;
            	}
        		break;
        	}
        	if(!s.substring(i, j).contains(s.substring(j, j+1))) {
            	j++;
            }else {
            	if(z<(j-i)) {
            		z=j-i;
            	}
            	i++;
            	j++;
            	
            }
        }
        return z;
        
    }
	
	
	public static void main(String [] args) {
		String str = "dvdf"; 
		Solution s = new Solution();
		System.out.println(s.lengthOfLongestSubstring(str));
	}
}
