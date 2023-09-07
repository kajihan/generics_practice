package advanced_generics.exampleOne;

import java.util.ArrayList;
import java.util.List;

public class WordSplitProcessor extends Processor<String, List<Character>> {

    public WordSplitProcessor(String id, String data) {
        super(id, data);
    }

    @Override
    public List<Character> process() {
        List<Character> characters = new ArrayList<>();
        for (char c : getData().toCharArray()) {
            characters.add(c);
        }
        return characters;
    }

    public static void main(String[] args) {
        WordSplitProcessor wordSplitProcessor = new WordSplitProcessor("id", "Generics");
        System.out.println(wordSplitProcessor.process());
    }
}
