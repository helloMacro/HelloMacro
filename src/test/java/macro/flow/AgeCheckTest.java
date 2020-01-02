package test.java.macro.flow;

import main.java.macro.flow.AgeCheck;
import org.junit.Assert;
import org.junit.Test;

public class AgeCheckTest {

    @Test
    public void testAgeCheck(){
        Assert.assertEquals(AgeCheck.getAge(5),"儿童");
        Assert.assertEquals(AgeCheck.getAge(21),"成人");
        Assert.assertEquals(AgeCheck.getAge(10),"学生");
        Assert.assertEquals(AgeCheck.getAge(3),"儿童");
        Assert.assertEquals(AgeCheck.getAge(105),"老人");
    }

}
