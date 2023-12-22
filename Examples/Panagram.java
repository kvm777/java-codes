package Examples;

//panagram -- a string which contains all the characters in alphabets

public class Panagram {
    public static void main(String[] args) {
        String s="The Quick brown fox jumps over the lazy dog";
        boolean b = Ispanagram(s);
        if(b)
            System.out.println("it`s a panagram");
        else
            System.out.println("not a panagraam");
    }
    
    public static boolean Ispanagram(String str){
        if(str.length()<26){
            return false;
        }
        else{
            str=str.toLowerCase();
            for(char c='a';c<='z';c++){
                if(str.indexOf(c)<0){
                    return false;
                }
            }
        }
        return true;
    }
}