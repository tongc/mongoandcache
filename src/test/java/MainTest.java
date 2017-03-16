import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class MainTest {
    @Test public void testSomeLibraryMethod() throws IOException {
        Main classUnderTest = new Main();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());

        MongoStarter starter = new MongoStarter();
        starter.start();
    }
}
