class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int a = k;
        int high=0,low=0;
        int l = s.length();
        int maxFreq=0;
        int maxLength = 0;
        

        while(high < l){
            char ch = s.charAt(high);
            freq[ch-'A']++;
            maxFreq = Math.max(maxFreq,freq[ch-'A']);

            int currLength=high-low+1;
            
            if(currLength - maxFreq > k){
                freq[s.charAt(low)-'A']--;
                low++;
            }

            currLength = high-low+1;
            
            maxLength = Math.max(currLength,maxLength);
            high++;
        }
        return maxLength;
    }
}
