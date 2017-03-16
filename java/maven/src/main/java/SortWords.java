import java.util.*;

/**
 * Created by yangzhou on 16/03/2017.
 */
public class SortWords {
    public static List<WordWithFrequency> sortWordsByFrequency(String inputString) {
        if (inputString.equals("") || inputString.equals(null)) return null;
        List<String> words = getWords(inputString);
        Map<String, Integer> wordsWithFrequency = getWordWithFrequency(words);
        List<WordWithFrequency> result = SortWordsWithFrequency(wordsWithFrequency);

        return result;
    }

    private static List<WordWithFrequency> SortWordsWithFrequency(Map<String, Integer> wordsWithFrequency) {
        List<WordWithFrequency> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsWithFrequency.entrySet())
            result.add(new WordWithFrequency(entry.getKey(), entry.getValue()));

        Collections.sort(result, Comparator.comparingInt(WordWithFrequency::getFrequency).reversed());
        return result;
    }

    private static Map<String, Integer> getWordWithFrequency(List<String> words) {
        Map<String, Integer> wordsWithFrequency = new HashMap<>();
        for (String entry : words){
            if (wordsWithFrequency.containsKey(entry)){
                Integer oldCount = wordsWithFrequency.get(entry);
                wordsWithFrequency.replace(entry, oldCount + 1);
            }
            else
                wordsWithFrequency.put(entry, 1);
        }

        return wordsWithFrequency;
    }

    private static List<String> getWords(String inputString) {
        char[] chars = inputString.toCharArray();
        String word = "";
        List<String> words = new ArrayList<>();
        for (char entry : chars){
            if (entry == ' ' && !word.equals("")) {
                words.add(word);
                word = "";
            }
            else if (entry != ' ')
                word += entry;
        }

        if (!word.equals("")) words.add(word);
        return words;
    }
}
