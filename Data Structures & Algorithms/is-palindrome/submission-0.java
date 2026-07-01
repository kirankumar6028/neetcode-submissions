class Solution {
    public boolean isPalindrome(String s) {
          StringBuilder str = new StringBuilder();
          for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
          }

          s = str.toString();
          int start = 0;
          int end = s.length()-1;
          boolean isTrue = true;
          while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                isTrue = false;
            }
            start++;
            end--;
          }
          return isTrue;
    }
}
