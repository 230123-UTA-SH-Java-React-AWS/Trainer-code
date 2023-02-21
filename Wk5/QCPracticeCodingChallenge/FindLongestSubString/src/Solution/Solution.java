package Solution;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    
    public static int getLongestSubstringLength(String someString)
    {
        int length = someString.length();
        int maxSize = 0;
        Set<Character> lets = new HashSet<>();

        for(int i = 0; i<length; i++)
        {
            int x = i;

            while(x < length)
            {
                char let = someString.charAt(x);

                if(!lets.contains(let))
                {
                    lets.add(let);
                }
                else
                {
                    lets.clear();
                    break;
                }

                if(lets.size() > maxSize)
                    maxSize = lets.size();
                
                x++;
            }
        }

        return maxSize;
    }
}
