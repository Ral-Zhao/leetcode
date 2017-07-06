package ransomNote;

import java.util.HashMap;
import java.util.Map;

public class Solution
{
	 public boolean canConstruct(String ransomNote, String magazine) 
	 {
		
		 if (ransomNote == null || magazine == null)
		 {
			 return false;
		 }
		 if(ransomNote.equals("") && magazine.equals(""))
		 {
			 return true;
		 }
		 if(ransomNote.equals("") && !magazine.equals(""))
		 {
			 return true;
		 }
		 
		 if(!ransomNote.equals("") && magazine.equals(""))
		 {
			 return false;
		 }
		 
		 if (ransomNote.length() > magazine.length())
		 {
			 return false;
		 }
		 
		 Map<Character,Integer> map2 = new HashMap<>();
		 
		 
		 for(int i=0;i<magazine.length();++i)
		 {
			 char ch = magazine.charAt(i);
			 if(map2.get(ch) == null)
			 {
				 map2.put(ch, 1);
			 }
			 else
			 {
				 map2.put(ch,map2.get(ch)+1);
				 System.out.println(map2.get(ch));
			 }
		 }
		 for(int i=0;i<ransomNote.length();++i)
		 {
			 char ch = ransomNote.charAt(i);
			 if(map2.get(ch) != null && map2.get(ch) > 0)
			 {
				 map2.put(ch,map2.get(ch)-1);
				 continue;
			 }
			 else
			 {
				 return false;
			 }
		 }
		 return true;
		 
		 
		 
	 }
}
