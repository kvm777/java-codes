package basics2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colle1 {
    public static void main(String[] args) {
        List <Student> studs = new ArrayList<>();
        studs.add(new Student(1,45));
        studs.add(new Student(2,25));
        studs.add(new Student(3,55));
        studs.add(new Student(4,95));
        studs.add(new Student(5,15));

        Collections.sort(studs, (s1,s2) ->{
            return s1.marks>s2.marks?-1: s1.marks<s2.marks?1:0;     //1 makes swap... -1 can`t
        });
        for(Student s:studs){
            System.out.println(s);
        }
    }
}

class Student{
    int rollNo;
    int marks;
    
    public Student(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
    }


}
