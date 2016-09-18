package test_suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;


public class TestBase {
    protected static File file;

    @BeforeClass(groups = {"positive", "negative"})
    public void setUp() {
        file = new File("my test file");

    }

    @AfterClass(groups = {"positive", "negative"})
    public void tearDown () {
        file.delete();
    }
}
