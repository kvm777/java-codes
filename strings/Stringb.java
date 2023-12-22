//to string method

public class Stringb {
    public static void main(String[] args) {
        Student s1= new Student(21, "Mahesh");
        //System.out.println(s1.age);
        //System.out.println(s1.sname);
        System.out.println(s1);
        System.out.println(s1.toString());
    } 
}

class Student{
    int age;
    String sname;
    public Student(int age,String sname){
        this.age=age;
        this.sname=sname;
    }

    public String toString(){
        return age +" : "+sname;
    }
    
}
