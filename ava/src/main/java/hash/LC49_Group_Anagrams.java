//

package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LC49_Group_Anagrams {
    public static void main(String arg[])
    {
        String arr[] = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String,List<String>> map = new HashMap<String, List<String>>();
        for(String str :arr)
        {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);

        }
        for(String str)
        {
            System.out.println();
        }
    }
}
