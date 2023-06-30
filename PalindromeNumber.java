class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        int temp;
        while(x > 0){
            temp = x % 10;
            x /= 10;
            reverse = reverse*10 + temp;
        }
        return reverse == original;
    }
}
