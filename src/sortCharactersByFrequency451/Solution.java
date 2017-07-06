package sortCharactersByFrequency451;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution
{
	public String frequencySort(String s) 
	{
		
		if(s.length() == 0)
		{
			return "";
		}
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> set = map.entrySet();

		
		PriorityQueue<Map.Entry<Character,Integer>> que = new PriorityQueue<>(set.size(),new Comparator<Map.Entry<Character,Integer>>()
		{
			@Override
			public int compare(Entry<Character, Integer> o1,
					Entry<Character, Integer> o2)
			{
				return o2.getValue() - o1.getValue();
			}
		});
		
		for(Map.Entry<Character,Integer> se : set)
		{
			
			que.add(se);
		}
		StringBuffer str2 = new StringBuffer();
		while(!que.isEmpty())
		{
			
			Map.Entry<Character,Integer> en = que.poll();
			int num = en.getValue();
			String ch = Character.toString(en.getKey());
			StringBuffer buf = new StringBuffer();
			for(int i=0;i<num;++i)
			{
				buf.append(ch);
			}
			
			str2.append(buf);
		}
		return str2.toString();
		
		
		
//       StringBuffer str = new StringBuffer();
//       for(int i=0;i<s.length();++i)
//       {
//    	   String temp = Character.toString(s.charAt(i));
//    	   int start = str.indexOf(temp);
//    	   int end = str.lastIndexOf(temp);
//    	   if(start != -1)
//    	   {
//    		   int num = end - start + 1;
//    		   int j=0;
//    		   while(j < str.length())
//    		   {
//    			   int span = str.lastIndexOf(str.substring(j,j+1)) - str.indexOf(str.substring(j,j+1));
//    			   if(span <= num)
//    			   {
//    				   String strTemp = str.substring(start,end+1) + temp;
//    				   str.delete(start,end+1);
//    				   str.insert(j,strTemp);
//    				   break;
//    			   }
//    			   j += span+1;
//    		   }
//    		   
//    		   
//    	   }
//    	   else
//    	   {
//    		   str.append(temp);
//    	   }
//    	   
//    	   
//    	   
//    	   
//       }
//        return str.toString();
    }
}
