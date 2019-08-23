import java.util.Arrays;

public class LC10RegularExpressionMatching {
  public boolean isMatch(String s, String p) {
    char[] charArray = s.toCharArray();
    char[] pArray = p.toCharArray();

    int charLength = charArray.length;
    int pArrayLength = pArray.length;

    System.out.println(pArrayLength);
    int pp = 0;
    for (int ps = 0; ps < charLength; ps++) {
      System.out.println(ps);
      System.out.println(pp);

      if(pp >= pArrayLength){
        return false;
      }

      System.out.println(charArray[ps]);
      System.out.println(pArray[pp]);

      if(charArray[ps] == pArray[pp]){
        pp++;
      }else{
        if(pArray[pp] == '*'){
          if(charArray[ps] == pArray[pp-1] || pArray[pp-1] == '.'){
            if(ps==charLength-1){
              System.out.println("ps"+ps);
              //if(pp+1<=pArrayLength-1){return false;}
            }
          }else if(pp+1 < pArrayLength){
            if(charArray[ps] == pArray[pp+1] || pArray[pp+1] == '.'){
              pp = pp + 2;
            }else {
              return false;
            }
          }else {
            return false;
          }
        }else if(pArray[pp] == '.'){
          pp++;
        }else{
          if(pp+2 < pArrayLength){
            if(pArray[pp+1] == '*'){
              if(charArray[ps] == pArray[pp+2] || pArray[pp+2] == '.'){
                pp = pp + 2;
              }else {
                return false;
              }
            }else{
              return false;
            }
          }else{
            return false;
          }

        }
      }

    }

    return true;
  }
}
