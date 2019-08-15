public class LC05LongestPalindromicString {
    public String longestPalindrome(String s) {
        String Ans = "";
        String tmpString = "";
        String[] splitStrings = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            splitStrings[i]=String.valueOf(s.charAt(i));
        }
        int end =0,start=0;
        if(s.length() <= 1){
            Ans = s;
        }else{
            for (int i = 0; i < s.length(); i++) {
                int len = Math.max(expandAroundCenter(s,i,i),expandAroundCenter(s,i,i+1));
                if(len > end -start){
                    start = i - (len - 1) / 2;
                    end = i + len / 2;
                }
            }

        }
        Ans = s.substring(start,end+1);
        return Ans;
    }
    private int expandAroundCenter(String s, int L, int R) {
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
