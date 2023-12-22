package unknowns;

public class Feb162 {
    public static void main(String[] args) {
        Add obj = new Add();
        obj.Addition();
    }
}

class Add{
    int n,m;
    public Add(){
        n=6;
        m=5;
    }
    public void Addition(){
        System.out.println("sum is " + (m+n));
    }
}

class Subadd extends Add{
    
}

