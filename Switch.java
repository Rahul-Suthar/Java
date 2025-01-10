import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("A sweet red fruit");
            case "orange" -> System.out.println("round fruit");
            case "grapes" -> System.out.println("small fruit");
            default -> System.out.println("Invalid fruit");
        }

        in.close();
    }
}
