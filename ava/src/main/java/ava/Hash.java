// 统计各个单词数量
package ava;

import java.util.HashMap;

public class Hash {
    public static void main(String arg[])
    {
        String arr[] = {"aaa","bbb","aaa","bbb","ccc","ddd"};
        HashMap<String,Integer> map = new HashMap<>();
        // 遍历数组中每个元素
        for (String s : arr)
        {
            // put方法写入，getOrDefault方法读取，如果没有这个键就返回0
            map.put(s, map.getOrDefault(s,0)+1);
        }

        // 遍历map中每个键
        for (String s:map.keySet())
        {
            System.out.println(s+":"+map.get(s));
        }


    }

}
