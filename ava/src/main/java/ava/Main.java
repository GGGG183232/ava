package ava;

public class Main {
    // 加上了 public 和 String[] args，这是标准的 Java 启动入口
    public static void main(String[] args) {

        // 使用标准的 System.out.println 替换掉预览版的 IO.println
        System.out.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
