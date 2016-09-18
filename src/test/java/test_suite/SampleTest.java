package test_suite;

import org.testng.annotations.Test;

public class SampleTest extends TestBase{

    @Test
    public void positiveCase1(){
        String expectedName = "my test file";
        String actualName = TestBase.file.getName();

    }

    @Test
    public void positiveCase2(){
        String expectedName = "my test file";
        String actualName = TestBase.file.getName();

    }

    @Test
    public void positiveCase3(){
        String expectedName = "my test file";
        String actualName = TestBase.file.getName();

    }

    @Test()
    public void negativeCase1(){
        //String expectedName = "fail";
        String expectedName = "my test file";
        String actualName = TestBase.file.getName();

    }

    @Test()
    public void negativeCase2(){
        String expectedName = "fail";
        String actualName = TestBase.file.getName();

    }
}
