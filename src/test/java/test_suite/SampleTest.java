package test_suite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends TestBase{


    @Test(groups = "positive", priority = 1, dataProviderClass = BookNamesFromFileProvider.class, dataProvider = "loadBookNameFromFile")
    public void positiveCase1(String fileName){
        String actualName = file.getName();
        System.out.println("positiveCase1");
        Assert.assertEquals(actualName, fileName);

    }

    @Test(groups = "positive", priority = 1, dataProvider = "books")
    public void positiveCase2(String fileName){
        String actualName = file.getName();
        System.out.println("positiveCase2");
        Assert.assertEquals(actualName, fileName);
    }

    @Test(groups = "positive", priority = 1, dataProvider = "books")
    public void positiveCase3(String fileName){
        String actualName = file.getName();
        System.out.println("positiveCase3");
        Assert.assertEquals(actualName, fileName);
    }

    @Test(groups = "negative", priority = 2, dataProvider = "books")
    public void negativeCase1(String fileName){
        String actualName = file.getName();
        System.out.println("negativeCase1");
        Assert.assertEquals(actualName, fileName);
    }

    @Test(groups = "negative", priority = 2, dataProvider = "books")
    public void negativeCase2(String fileName){
        String actualName = file.getName();
        System.out.println("negativeCase2");
        Assert.assertEquals(actualName, fileName);

    }
}
