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
    public void tests_reverseWords() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god",
                words.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", words.reverseWords("apple"));
        assertEquals("a b c d", words.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", words.reverseWords("double  spaced  words"));
        assertEquals("   ", words.reverseWords("   "));
        assertEquals("a", words.reverseWords("a"));
        assertEquals("", words.reverseWords(""));
        assertEquals("sihT si eht tsrif .ecnetnes  sihT si eht .dnoces",
                words.reverseWords("This is the first sentence.  This is the second."));

    }

    @Test
    public void tests_reverse() {
        assertEquals(".god", words.reverse("dog."));
        assertEquals("elppa", words.reverse("apple"));
        assertEquals("d c b a", words.reverse("a b c d"));
        assertEquals("sdrow  decaps  elbuod", words.reverse("double  spaced  words"));
    }


}