public class LC07ReverseInteger {
    public int reverse(int x) {
        int Ans = 0;
        Long xa = 0L;
        //xがマイナスなら絶対値をとる
        boolean minusFlag = false;
        if(x < 0){
            if(x <= -2147483648){
                xa = Long.valueOf(x);
                xa = Math.abs(xa);
            }else{
                x = Math.abs(x);
                System.out.println(x);
                xa = Long.valueOf(x);
            }
            minusFlag = true;
        }else{
            xa = Long.valueOf(x);
        }



        String ans = "";
        //けたチェック
        int valLen = String.valueOf( xa ).length();
        String[] str = new String[valLen];

        //けた10で割って、そのけたの数字をだす
        for (int i = 1; i <= valLen; i++) {
            if(xa == 0){
                str[valLen - i] = "0";
            }else {
                double s = xa / (Math.pow(10, (valLen - i)));//500/100 s5
                str[valLen - i] = String.valueOf((int) s);
                s = xa - (int) s * (Math.pow(10, valLen - i));//500-s*100
                xa = Long.valueOf((int)s);
            }
        }
        boolean flag = false;
        for (int i =0; i < valLen; i++) {
            if(!flag && !str[i].equals("0")){
                flag = true;
                ans += str[i];
            }
            else if(flag){
                ans += str[i];
            }
        }

        if(ans.equals("")){
            Ans = 0;
        }else{
            if(Long.valueOf(ans) > 2147483647 || Long.valueOf(ans) < -2147483648){
                Ans = 0;
            }else{
                Ans = Integer.valueOf(ans);
            }
        }


        //FlagがTrueのときAnsをマイナスに戻す
        if(minusFlag){
            Ans = 0 - Ans;
        }

        return Ans;
    }
}
