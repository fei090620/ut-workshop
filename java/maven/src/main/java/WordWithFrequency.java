/**
 * Created by yangzhou on 17/03/2017.
 */
public class WordWithFrequency {
    private String word;
    private Integer frequency;

    public WordWithFrequency(String wordTemp, Integer frequencyTemp) {
        word = wordTemp;
        frequency = frequencyTemp;
    }

    public String getWord(){
        return word;
    }

    public Integer getFrequency(){
        return frequency;
    }

    @Override
    public String toString(){
        return word + frequency;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        WordWithFrequency other = (WordWithFrequency)obj;
        return word.equals(other.getWord())
                && frequency - other.getFrequency() < 0.001;
    }
}
