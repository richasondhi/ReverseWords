import com.sun.org.glassfish.gmbal.Description;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ReverseWordsTest {
    public ReverseWords words;

    @Before
    public void setUp() {
        this.words = new ReverseWords();
    }

    @Rule
    public ExpectedException exception =ExpectedException.none();


    @Test
    public void test() {
        assertEquals("emocleW", words.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", words.spinWords("Hey fellow warriors"));
    }


}