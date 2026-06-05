class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int[] freq = new int[26];
       for(char ch : s1.toCharArray()){
        freq[ch-'a']++;
       }
        int windowS = s1.length();
        s2= s2+" ";
        for(int i=0;i<s2.length()-windowS;i++){
            int[] freq2 = new int[26];

            String sub = s2.substring(i,i+windowS);
            System.out.println(sub+ " ");
                for(char ch : sub.toCharArray()){
                    
                freq2[ch-'a']++;
            }

            if(Arrays.equals(freq,freq2))
            return true;
       } 

       return false;
    }
}
