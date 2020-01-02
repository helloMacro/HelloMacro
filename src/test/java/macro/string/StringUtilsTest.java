package test.java.macro.string;

import main.java.macro.string.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    //trim()实现
    @Test
    public void testTrim(){
        String hello = "hello";
        Assert.assertEquals(StringUtils.trimAll(" hello "),hello);
        Assert.assertEquals(StringUtils.trimAll(" hello           "),hello);
        //Assert.assertEquals(StringUtils.trimAll(" hello "),hello);
        Assert.assertEquals(StringUtils.trimAll("         hello "),hello);
        //Assert.assertEquals(StringUtils.trimAll(" hello "),hello);

    }
}
