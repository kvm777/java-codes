package oops;

/*
 inheritance is method of extention of one class to another class...
 th syntex for inheritance is  ----- class A extends B-------- in line 29 afters
 all the things in B inherites to A....

--->>java doesnot supports the multiple level inheritance..
 */
public class Inheritance {
    public static void main(String[] args) {
        AddSubMul obj1 = new AddSubMul();
        obj1.n=5;
        obj1.m=6;
        obj1.sum();
        obj1.sub();
        obj1.mul();
    }
}

class Add{
    int n,m,r;
    public void sum()
    {
        System.out.println(n+m);
    }
}


class AddSub extends Add{       //single level inheritance
    public void sub()
    {
        System.out.println(n-m);
    }
}

class AddSubMul extends AddSub{      //multi level inheritance
    public void mul()
    {
        System.out.println(n*m);
    }
}