import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by yangzhou on 16/03/2017.
 */
public class WordFrequencySortTest {

    @Test
    public void given_empty_string_when_return_empty_string(){
        String inputString = "";
        List<WordWithFrequency> sortedResult = SortWords.sortWordsByFrequency(inputString);
        assertEquals(null,sortedResult);
    }

    @Test
    public void given_one_word_string_when_return_the_word_and_count_1(){
        String inputString = "ss";
        List<WordWithFrequency> sortedResult = SortWords.sortWordsByFrequency(inputString);

        List<WordWithFrequency> expectedResult = new ArrayList<>();
        expectedResult.add(new WordWithFrequency("ss",1));
        assertArrayEquals(expectedResult.toArray(), sortedResult.toArray());
    }

    @Test
    public void given_word_and_space_and_the_same_word_string_when_return_the_word_and_count_2(){
        String inputString = "ss ss";
        List<WordWithFrequency> sortedResult = SortWords.sortWordsByFrequency(inputString);

        List<WordWithFrequency> expectedResult = new ArrayList<>();
        expectedResult.add(new WordWithFrequency("ss",2));

        assertArrayEquals(expectedResult.toArray(), sortedResult.toArray());
    }

    @Test
    public void given_different_words_with_space_string_then_return_the_words_and_the_words_count(){
        String inputString = "ss ll ss";
        List<WordWithFrequency> sortedResult = SortWords.sortWordsByFrequency(inputString);
        List<WordWithFrequency> expectedResult = new ArrayList<>();
        expectedResult.add(new WordWithFrequency("ss",2));
        expectedResult.add(new WordWithFrequency("ll",1));

        assertArrayEquals(expectedResult.toArray(), sortedResult.toArray());
    }

    @Test
    public void given_different_words_with_multiple_space_string_then_return_the_words_and_the_words_count(){
        String inputString = "ss ll    ss";
        List<WordWithFrequency> sortedResult = SortWords.sortWordsByFrequency(inputString);
        List<WordWithFrequency> expectedResult = new ArrayList<>();
        expectedResult.add(new WordWithFrequency("ss",2));
        expectedResult.add(new WordWithFrequency("ll",1));

        assertArrayEquals(expectedResult.toArray(), sortedResult.toArray());
    }

    @Test
    public void given_different_words_with_space_and_overlapping_string_then_return_the_words_and_the_words_count(){
        String inputString = "ss ll  ss  ssll";
        List<WordWithFrequency> sortedResult = SortWords.sortWordsByFrequency(inputString);
        List<WordWithFrequency> expectedResult = new ArrayList<>();
        expectedResult.add(new WordWithFrequency("ss",2));
        expectedResult.add(new WordWithFrequency("ll",1));
        expectedResult.add(new WordWithFrequency("ssll",1));

        assertArrayEquals(expectedResult.toArray(), sortedResult.toArray());
    }
}
