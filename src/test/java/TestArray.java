

import org.junit.Assert;
import org.junit.Test;


public class TestArray {
    @Test
    public void test1arrayBefore4() {
        int[] in = new int[]{1, 3, 4, 5, 5, 6, 8};
        int[] out = new int[]{5, 5, 6, 8};
        Assert.assertArrayEquals(out, Main.arrayBefore4(in));
    }

//    @Test(expected = RuntimeException.class)
//    public void test2arrayBefore4() {
//        int[] in = new int[]{1, 3, 4, 5, 5, 6, 8};
//        Main.arrayBefore4(in);
//    }

    @Test
    public void test1arrayContains1and4(){
        int[] in = new int[]{1, 2, 3, 4, 5, 6};
        Assert.assertFalse(Main.arrayContains1and4(in));
    }

    @Test
    public void test2arrayContains1and4(){
        int[] in = new int[]{1, 4, 4, 4, 1, 1};
        Assert.assertTrue(Main.arrayContains1and4(in));
    }
}