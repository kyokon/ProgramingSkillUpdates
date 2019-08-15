public class LC09PalindromeNumber {
    public boolean isPalindrome(int x) {
      String xstr = "";
      int xlen = 0;
      int xmid = 0;
      xstr = String.valueOf(x);
      xlen = xstr.length();
      if(xlen == 1){
        return true;
      }else{
        if(xlen % 2 != 0){
          xmid = xlen/2 + 1;
          for(int i = 1; i <= (xlen - xmid); i++){
            if(!(xstr.charAt(xmid - i - 1) == xstr.charAt(xmid + i - 1))){
              return false;
            }
          }
        }else{
          xmid = xlen/2;
          for(int i = 1; i <= (xlen - xmid); i++){
            if(!(xstr.charAt(xmid - i) == xstr.charAt(xmid + i - 1))){
              return false;
            }
          }
        }
        return true;
      }
    }
}
