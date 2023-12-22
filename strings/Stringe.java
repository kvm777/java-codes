
/*
 * stringBuffer and StringBuilder....
 * stringBuilder is not safe..so we always use string buffer..
 */

public class Stringe {
    public static void main(String[] args) {
        StringBuffer sbf =new StringBuffer("Mahesh");
        System.out.println(sbf);

        sbf=sbf.append(" Korada");
        System.out.println(sbf);

        sbf.reverse(); 
        System.out.println(sbf);
        
        sbf.replace(0, 6, "good");
        System.out.println(sbf);
    }
}
