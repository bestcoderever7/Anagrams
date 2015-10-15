import static org.junit.Assert.*;

import org.junit.Test;


public class AnagramTest {

	@Test
	public void test() {
		assertEquals(true, Solution.isAnagram("Carlos", "cArlso"));
		assertEquals(true, Solution.isAnagram("Jenny", "nyenj"));
		assertEquals(true, Solution.isAnagram("aabb", "abab"));
		assertEquals(false, Solution.isAnagram("B", "Halloween: The Revenge of Michael Myers 2: It's Happening Again"));
		assertEquals(false, Solution.isAnagram("House", "Anubis"));
		assertEquals(false, Solution.isAnagram("big", "lig"));
	}

}
