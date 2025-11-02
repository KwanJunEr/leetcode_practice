package java.easy.q344_reversestring;

public class solution1_twopointers {

    public void reverseString(char[] s) {
        int right = s.length - 1;
        for (int left = 0; left < s.length / 2; left++) {
            char bucket = s[left];
            s[left] = s[right];
            s[right] = bucket;

            right--;
        }
    }
}
