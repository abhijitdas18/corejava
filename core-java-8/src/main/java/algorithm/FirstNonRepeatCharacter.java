package algorithm;
import java.util.HashMap;

public class FirstNonRepeatCharacter {

	public static void main(String[] args) {
		System.out.println(f("saattrreess"));	
	}
	public static String f(String str)
	{
		HashMap<Character , Integer> hMap = new HashMap<>();
		String toUpper = str.toUpperCase();
		
		for(int i= 0 ; i< toUpper.length(); i++)
		{
			char ch = toUpper.charAt(i);
			if(hMap.containsKey(ch))
			{
				hMap.put(ch, hMap.get(ch) + 1);
			}
			else
			{
				hMap.put(ch, 1);
			}
		}
		
		String result = "";
		for(int i=0 ;i< toUpper.length(); i++)
		{
			char ch = toUpper.charAt(i);
			char res = str.charAt(i);
			
			
			if(hMap.get(ch) == 1)
			{
				result = Character.toString(res);
				break;
			}
			else if(hMap.get(ch) > 1)
			{
				result =  "";
				continue;
			}else {
				result =  "not found";
				continue;
			}
		}
		return result;
	}

}
