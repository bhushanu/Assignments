package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.Test;

public class FindUniqueTest {
	
	@Test
	public void checkUnique()
	{
		String text = "This paragraph is with different words and same words and is long";
		
		Map<String, Integer> uniques = FindUnique.countUnique(text);
		
		assertEquals(2,uniques.get("is"));
		assertEquals(2,uniques.get("and"));
		assertEquals(2,uniques.get("words"));
		assertEquals(1,uniques.get("paragraph"));
		assertEquals(1,uniques.get("this"));
		
	}
	

}
