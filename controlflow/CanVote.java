package controlflow;

public class CanVote {
    public static void main(String[] args) {
        boolean isCitizen=false;
        int age=18;
        if (isCitizen && age >=18){
            System.out.println("The person can vote");
        }else {
            System.out.println("The person can't vote");
        }
    }

}
