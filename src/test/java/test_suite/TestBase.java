package test_suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;


public class TestBase {
    protected static File file;

    @BeforeClass
    public void setUp() {
        file = new File("my test file");

    }

    @AfterClass
    public void tearDown () {
        file.delete();
    }
}
