package algorithm;
import java.util.HashMap;
// find a max no. of a character 
public class MaxNoOfCharacterInString {

	public static void main(String[] args) {
		// String text = "wfaveqr caaaaaaaaaaaafwefwgqrvwerwbhqfvwrfwvbetqfwef q fwgwfw
		// erfq";
		String text = "abcdrideoeooooaaaaaaaaaaaaa";
		System.out.println("The max character is : " + findMaxNoOfChar(text));
	}

	public static Character findMaxNoOfChar(String text) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Character maxChar = ' ';
		int lenOfText = text.length();
		long max = -1;
		if ((lenOfText >= 10 && lenOfText <=10000) && text.matches("^[a-zA-Z0-9]*$")) {
			for (int i = 0; i < lenOfText; i++) {
				Character current = text.charAt(i);
				if (map.containsKey(current)) {
					map.put(current, map.get(current) + 1);
				} else {
					map.put(current, 1);
				}
				if (map.get(current) > max) {
					maxChar = current;
					max = map.get(current);
				}
			}
			
		}
		return maxChar;
	}

}
