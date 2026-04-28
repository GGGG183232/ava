package ava;

//一个Java文件只能有一个public类
//person类抽象类
class Person {
    public String name;
    public int age;
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void output()
    {
        System.out.println(name+" "+age);
    }
}

//派生类学生类
class Student extends Person
{
    public int id;
    private double score;
    // final关键字:一经赋值不可以再修改
    private final double total_score = 100;
    public Student(String name, int age, int id, int score)
    {
        super(name,age);
        this.id = id;
        this.score = score;
    }
    @Override //会帮我检查是否重写成功
    public void output()
    {
        System.out.println(id+" "+score+" "+name+" "+age);
    }
    private void setscore(double score)
    {
        this.score = score;
    }
    private double getscore()
    {
        return this.score;
    }

}

class Monitor extends Student
{

    public Monitor(String name, int age, int id, int score) {
        super(name, age, id, score);
    }

}
class Teacher extends Person
{

    private int id;
    public Teacher(String name, int age,int id)
    {
        this.id = id;
        super(name, age);
    }
    @Override
    public void output()
    {
        //super调用
        super.output();
        System.out.println(id+" "+name+" "+age);
    }
}
//public类的类名必须与文件名一致。
public class Stu
{
    public static void main(String[] args)
    {
        Student a1=new Student("a1",1,1,99);
        Student a2=new Student("a2",2,2,88);
        Student a3=new Student("a3",3,3,77);
        Teacher c1=new Teacher("c1",40,1);
        
    }
}
