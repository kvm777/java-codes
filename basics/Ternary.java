package basics;
class Ternary {
    public static void main(String[] args) 
    {
        int i=1;
        int j=5;
        j = i==1?6:7;  //ternary operator 
        System.out.println(j);

        Object obj1;
        if(true)
        {
            obj1=new Integer(10);
        }
        else
        {
            obj1 = new Double(15.0); 
        }
        System.out.println(obj1);
        
        Object obj2;

        obj2= true? new Integer(20): new Double(25.0);
        System.out.println(obj2);
    }
}
