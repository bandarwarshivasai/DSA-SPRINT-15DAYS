class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash=new int[256];
        for(int i=0;i<hash.length-1;i++){
            hash[i]=-1;
        }
        int l = 0, maxlen = 0;               
        for (int r = 0; r < s.length(); r++) {  
            char ch = s.charAt(r);           

            if (hash[ch] >= l) {             
                l = hash[ch] + 1;            
            }

            hash[ch] = r;                    
            maxlen = Math.max(maxlen, r - l + 1); 
        }

        return maxlen;                       
    }
}