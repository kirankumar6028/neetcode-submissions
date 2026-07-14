class Solution {
    public int characterReplacement(String s, int k) {

        int[] frequencyArray = new int[26];
        int left = 0;
        int maxFrequency = 0;
        int maxWindow = 0;

        for(int right = 0; right < s.length(); right++){
            frequencyArray[s.charAt(right)-'A']++;


            maxFrequency = Math.max(maxFrequency, frequencyArray[s.charAt(right)-'A']);

            int windowsize = right - left + 1;
            if(windowsize - maxFrequency > k){
                frequencyArray[s.charAt(left)-'A']--;
                left++;
            }

            windowsize = right - left + 1;
            maxWindow = Math.max(maxWindow, windowsize);
        }
        return maxWindow;
    }
}
