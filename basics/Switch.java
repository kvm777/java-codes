package basics;
public class Switch {
    public static void main(String[] args) {
        int i=4;

        switch(i)
        {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 6:
                System.out.println("six");
                break;
            default:
                System.out.println("none");
                break;
            
        }
    }
}
