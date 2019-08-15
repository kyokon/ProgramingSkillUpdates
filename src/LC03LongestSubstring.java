public class LC03LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int counter = 0;
        String[] splitStrings = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            splitStrings[i]=String.valueOf(s.charAt(i));
        }
        String preString = "";
        for (int i = 0; i < splitStrings.length; i++) {
            if(!preString.contains(splitStrings[i])){
                counter++;
                preString += splitStrings[i];
                System.out.print(counter);
                System.out.println(preString);
            }else{
                if(ans < counter){ans = counter;}
                preString += splitStrings[i];
                int ss = preString.indexOf(splitStrings[i]);
                preString = preString.substring(ss+1,preString.length());
                counter = preString.length();
            }
        }
        if(ans < counter){ans = counter;}
        return ans;
    }
}
