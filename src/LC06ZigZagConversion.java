class LC06ZigZagConversion {
    public String convert(String s, int numRows) {
        String Ans = "";

        String[] splitStrings = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            splitStrings[i] = String.valueOf(s.charAt(i));
        }
        if(s.length()<=2 || numRows<2){
            Ans = s;
        }else{
            int Pattern = 0, length = 0, totalPattern = 0;

            if(s.length()%(numRows-2+numRows) != 0){
                Pattern = s.length()/(numRows-2+numRows);//パターン数
                length = Pattern*(numRows-1)+(s.length()%(numRows-2+numRows));//配列のながさ
            }else{
                Pattern = s.length()/(numRows-2+numRows);//パターン数
                length = Pattern*(numRows-1);//配列のながさ
            }
            totalPattern = numRows-2+numRows;//１パターンに入る合計文字数

            String[][] zigzag = new String[numRows][length];

            int rowcounter =0;
            int minuscounter = 0;
            for (int i = 0; i < s.length(); i++) {
                if(i % totalPattern < numRows){
                    System.out.println(i % totalPattern);
                    zigzag[i % totalPattern][rowcounter] = splitStrings[i];
                    if(i%totalPattern ==totalPattern-1){
                        rowcounter++;
                    }
                }else {
                    rowcounter++;
                    minuscounter = i % totalPattern - numRows + 1;

                    System.out.println("num"+numRows+"row"+rowcounter);
                    zigzag[numRows-1-minuscounter][rowcounter] = splitStrings[i];
                    if(i%totalPattern ==totalPattern-1){
                        rowcounter++;
                    }
                }
            }

            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < length; j++) {
                    if(zigzag[i][j] != null) {
                        Ans += zigzag[i][j];
                    }
                }
            }
            System.out.println(Ans);
        }

        return Ans;
    }
}