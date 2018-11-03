package leetcodepractice;

import java.util.HashSet;
import java.util.Set;

public class Problem3 {

	public int getLongestNonRepeatingSubstring(String s) {
		Set<Character> characterSet = new HashSet<Character>(s.length());

		int sum = 0, i = 0, j = 0;
		int stringSize = s.length();
		// [i,j]

		// loop through with two iterators, adding to the map when one found and
		// snapping the max and when a duplicate is found, remove

		// add the first character to the character set
		// characterSet.add(s.charAt(i++))

		while (i < stringSize && j < stringSize) {

			if (!characterSet.contains(s.charAt(j))) {

				characterSet.add(s.charAt(j++));
				if (j - i > sum) {
					sum = j - i;
				}
			} else {

				if (j - i > sum) {
					sum = j - i;
				}
				characterSet.remove(s.charAt(i++));
			}

		}

		return sum;
	}

}
