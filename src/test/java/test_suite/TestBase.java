package test_suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class TestBase {
    protected static File file;

    @BeforeClass(groups = {"positive", "negative"})
    public void setUp() {
        file = new File("Lord of the ring");

    }

    @AfterClass(groups = {"positive", "negative"})
    public void tearDown () {
        file.delete();
    }

    @DataProvider
    public Iterator<Object[]> books ()  {

        List<Object[]> userData = new ArrayList<>();
        userData.add(new Object[]{"Game of thrones"});
        userData.add(new Object[]{"Lord of the ring"});
        userData.add(new Object[]{"Harry Potter"});
        return userData.iterator();
    }


}
