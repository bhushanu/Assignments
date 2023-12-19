package tdd;

import java.util.HashMap;
import java.util.Map;

public class FindUnique {

	public static Map<String, Integer> countUnique(String text) {
		
		Map<String, Integer> uniqueCount = new HashMap<>();
		
		String[] paragraphs = text.split("\\n\\s*\\s");
		String[] words;
		
		for(String paragraph : paragraphs)
		{
			words = getWords(paragraph);
			updateWordCount(uniqueCount, words);
		}
		
		return uniqueCount;
	}

	private static void updateWordCount(Map<String, Integer> uniqueCount, String[] words) {
		
		for (String word : words) {
            uniqueCount.put(word, uniqueCount.getOrDefault(word, 0) + 1);
        }
	}

	private static String[] getWords(String paragraph) {
		
		return paragraph.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
	}

}
