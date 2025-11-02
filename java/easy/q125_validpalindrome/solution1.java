package java.easy.q125_validpalindrome;

public class solution1 {
      public boolean isPalindrome(String s) {
        //join first 
        //then turn into 
        //two pointer with split into two
        String result = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int right = result.length() - 1;
        for(int left = 0; left < result.length()/2; left++){
            if(result.charAt(left) != result.charAt(right)){
                return false;
            }
            right--;
        }
        return true;
    }
}
