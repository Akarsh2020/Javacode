package controlflow;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String FruitName="Akarsh";
        switch (FruitName){
            case "Apple":
                System.out.println("$ 1.5 rupees");
                break;
            case "Banana":
                System.out.println("$1 rupees");
                break;

            case "Grapes":
                System.out.println("$32 rupees");
                        break;
            case "Mango":
                System.out.println("45 rupesss");
                break;
            default:
                System.out.println("Enter valid fruit");
                break;
        }

    }
}
