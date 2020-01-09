package reconstructOriginalDigitsfromEnglish423;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution
{
	public String originalDigits(String s) 
	{
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<26;++i)
		{
			char ch = (char)('a'+i);
			map.put(ch,0);
		}
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<s.length();++i)
		{
			char ch = s.charAt(i);
			map.put(ch,map.get(ch)+1);
		}
		if(map.get('z') > 0)
		{
			int numZ = map.get('z');
			map.put('o',map.get('o')-numZ);
			while(numZ > 0)
			{
				list.add(0);
				numZ -= 1;
			}

		}
		if(map.get('w') > 0)
		{
			int numW = map.get('w');
			map.put('t',map.get('t')-numW);
			map.put('o',map.get('o')-numW);
			while(numW > 0)
			{
				list.add(2);
				numW -= 1;
			}

		}
		if(map.get('u') > 0)
		{
			int numZ = map.get('u');
			map.put('f',map.get('f')-numZ);
			map.put('o',map.get('o')-numZ);
			while(numZ > 0)
			{
				list.add(4);
				numZ -= 1;
			}

		}
		if(map.get('x') > 0)
		{
			int numZ = map.get('x');
			map.put('s',map.get('s')-numZ);
			map.put('i',map.get('i')-numZ);
			while(numZ > 0)
			{
				list.add(6);
				numZ -= 1;
			}

		}
		if(map.get('g') > 0)
		{
			int numZ = map.get('g');
			map.put('i',map.get('i')-numZ);
			map.put('t',map.get('t')-numZ);
			while(numZ > 0)
			{
				list.add(8);
				numZ -= 1;
			}

		}
		
		if(map.get('o') > 0)
		{
			int numZ = map.get('o');
			while(numZ > 0)
			{
				list.add(1);
				numZ -= 1;
			}

		}
		if(map.get('f') > 0)
		{
			int numZ = map.get('f');
			map.put('i',map.get('i')-numZ);
			while(numZ > 0)
			{
				list.add(5);
				numZ -= 1;
			}

		}
		if(map.get('s') > 0)
		{
			int numZ = map.get('s');
			while(numZ > 0)
			{
				list.add(7);
				numZ -= 1;
			}

		}
		if(map.get('t') > 0)
		{
			int numZ = map.get('t');
			while(numZ > 0)
			{
				list.add(3);
				numZ -= 1;
			}

		}
		if(map.get('i') > 0)
		{
			int numZ = map.get('i');
			while(numZ > 0)
			{
				list.add(9);
				numZ -= 1;
			}

		}
		Collections.sort(list);
		StringBuffer str = new StringBuffer();
		for(int i : list)
		{
			str.append(i);
		}
		return str.toString();
    }
}
