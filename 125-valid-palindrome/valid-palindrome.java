class Solution {
    public boolean isPalindrome(String s) {
         s=s.toLowerCase();
        String nonpal="";
        String pal="";
        int len=s.length();
        for(int i=len-1;i>=0;i--){
            if(Character.isLetterOrDigit(s.charAt(i))){
                pal=pal+s.charAt(i);
            }
        }
        for(int i=0;i<len;i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                nonpal=nonpal+s.charAt(i);
            }
        }
       
        
       if(pal.equals(nonpal)){
        return true;
       }
       return false;
    }
    }
