package basics2;

enum Color{
    RED("red"),BLACK ("black"),BLUE("blue");

    private String valve;

    Color(String value){
        this.valve=value;
    }
    public String getValue(){
        return valve;
    }
}


public class Enum {
    public static void main(String[] args) {
        Color c1 =Color.RED;

        System.out.println("red enum name : "+c1.name());
        System.out.println("red enum value : "+c1.getValue());

        for(Color color:Color.values()){
            System.out.println(color.name()+" : "+color.getValue());
        }
    }
}


