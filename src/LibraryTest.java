import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/13/12
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpOutput(){
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanOutput(){
        System.setOut(null);
    }
    @Test
    public void should_ask_the_librarian_when_choose_3(){
        try{
            String data = "3";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            Library library = new Library();
            library.dispose();
            assertEquals("Please talk to the librarian.",outContent.toString());

        }finally{
            System.setIn(System.in);
        }
    }
    
}
