import junit.framework.TestCase;

public class FirstUniqueCharacterInStringTest  extends TestCase {

    public void testProfit1(){
        String s = "leetcode";
        int actual = Main.Solution.firstUniqChar(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

    public void testProfit2(){
        String s = "loveleetcode";
        int actual = Main.Solution.firstUniqChar(s);
        int expected = 2;
        assertEquals(expected, actual);
    }

    public void testProfit3(){
        String s = "aabb";
        int actual = Main.Solution.firstUniqChar(s);
        int expected = -1;
        assertEquals(expected, actual);
    }
}
