class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = "";
        int len = s.length();

        for (int i = len - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return s.equals(rev);

    }
}



//Method 2

class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        return s.equals(rev);
    }
}
