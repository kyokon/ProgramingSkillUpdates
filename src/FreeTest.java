import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class FreeTest {
    LC10RegularExpressionMatching testClass;

    LC11ContainerWater testClass2;
    LC11ContainerWater lc11ContainerWater = new LC11ContainerWater();

    int AnsInt = 0;
    String AnsString = "";
    boolean AnsBoolean = true;

    @Before
    public void beforeTest(){
        testClass = new LC10RegularExpressionMatching();
        testClass2 = new LC11ContainerWater();
    }

    @Test
    public void test1() {
        String str = "mississippi";
        String ttr = "mis*is*ip*.";
        AnsBoolean = testClass.isMatch(str,ttr);
        //System.out.println(AnsString);
        if(AnsBoolean){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

    @Test
    public void test2() {

        int[] height = {1,8,6,2,5,4,8,3,7};
        //int[] height = {1,2,1};
        int s = testClass2.maxArea(height);

        System.out.println(s);
        //System.out.println(AnsInt);

    }


}
