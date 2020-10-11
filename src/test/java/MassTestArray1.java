import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassTestArray1 {
    private int[] in;
    private int[] out;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {new int[]{2,5,3,4,0}, new int[]{0}},
            {new int[]{2,4}, new int[]{}}
        });
    }

    public MassTestArray1(int[] in, int[] out) {
        this.in = in;
        this.out = out;
    }
    @Test
    public void massTestarrayBefore4(){
        Assert.assertArrayEquals(out, Main.arrayBefore4(in));
    }

}
