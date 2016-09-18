package test_suite;

import org.testng.annotations.Test;

public class SampleTest extends TestBase{


    @Test(groups = "positive", priority = 1)
    public void positiveCase1(){
        String expectedName = "my test file";
        String actualName = TestBase.file.getName();
        System.out.println("positive ");

    }

    @Test(groups = "positive", priority = 1)
    public void positiveCase2(){
        String expectedName = "my test file";
        String actualName = TestBase.file.getName();
        System.out.println("positive ");
    }

    @Test(groups = "positive", priority = 1)
    public void positiveCase3(){
        String expectedName = "my test file";
        String actualName = TestBase.file.getName();
        System.out.println("positive ");
    }

    @Test(groups = "negative", priority = 2)
    public void negativeCase1(){
        String expectedName = "my test file";
        String actualName = TestBase.file.getName();
        System.out.println("negative ");
    }

    @Test(groups = "negative", priority = 2)
    public void negativeCase2(){
        String expectedName = "fail";
        String actualName = TestBase.file.getName();
        System.out.println("negative ");
    }
}
