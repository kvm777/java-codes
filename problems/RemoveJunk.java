package problems;

public class RemoveJunk {
    public static void main(String[] args) {
        String s ="$$%$^565+-55^46#%hgn mahnejg mahenn %^%23";
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);

        String s1 = "something good   is   only   by     bad   ";
        System.out.println("before removing spaces : "+s1);
        s1=s1.replaceAll("\\s", "");
        System.out.println("after removing spaces : "+s1);
    } 
}


