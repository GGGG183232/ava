package hash;

import java.util.HashMap;

public class Count_Word_Frequency {
    public static void main(String args[])
    {
        String arr[] = {"aaa", "aaa", "bbb", "ccc", "ddd"};
        HashMap<String, Integer> map = new HashMap<>();
        for(String key :arr)
        {
            // 判断键是否存在
            if(map.containsKey(key))
            {
                map.put(key, map.get(key)+1);
            }
            else
            {
                map.put(key, 1);
            }
        }
        // map.keySet:按照键来遍历
        for(String key : map.keySet())
        {
            System.out.println(key + " : " + map.get(key));
        }

    }
}
