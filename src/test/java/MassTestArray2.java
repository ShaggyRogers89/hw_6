import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassTestArray2 {
    private int[] in;
    boolean check;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
                {new int[]{1, 5, 3, 3, 0}, false},
                {new int[]{1, 4}, true}
        });
    }

    public MassTestArray2(int[] in, boolean check) {
        this.in = in;
        this.check = check;
    }

    @Test
    public void massTestarrayContains1and4() {
        Assert.assertEquals(check, Main.arrayContains1and4(in));
    }

}