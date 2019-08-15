import org.junit.Test;

public class FreeTest {
    LC07ReverseInteger testClass;

    int AnsInt = 0;
    String AnsString = "";

    public void beforeTest(){
        testClass = new LC07ReverseInteger();
    }

    public void test1() {
        //String str = "PAYPALISHIRING";

        AnsInt = testClass.reverse(32768);
        //System.out.println(AnsString);
        System.out.println(AnsInt);

    }

    @Test
    public void test2() {

        //System.out.println(AnsString);
        System.out.println(AnsInt);

    }
}
