public class StudentsTest {
    public static void main(String[] args) {
        Student [] stubs =new Student[20];
        for(int i=0;i< stubs.length;i++)
        {
            stubs[i]=new Student();
            stubs[i].number=i+1;
            stubs[i].state= (int)( Math.random()*6+1);
            stubs[i].score=(int)( Math.random()*101);
            System.out.println(stubs[i].info());
        }
    }
}
class Student
{
    int number;
    int state;
    int score;
    public String info(){
        return "学号："+number+" ,年级："+state+" ,分数"+score;
    }
}
