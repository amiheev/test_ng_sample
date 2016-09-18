package test_suite;

import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BookNamesFromFileProvider {
    @DataProvider
    public static Iterator<Object[]> loadBookNameFromFile() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(
                BookNamesFromFileProvider.class.getResourceAsStream("/bookNames.data")));

        List<Object[]> userData = new ArrayList<>();
        String line = in.readLine();
        while (line != null) {
            userData.add(line.split(","));
            line = in.readLine();
        }

        in.close();

        return userData.iterator();
    }
}
