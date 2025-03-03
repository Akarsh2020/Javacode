package controlflow;

public class MessageForDay {
    public static void main(String[] args) {
        String dayOfWeek="Wednesday";
        if (dayOfWeek.equals("Saturday")||dayOfWeek.equals("Sunday")){

            System.out.println("Hoory,two days holiday");

            if (dayOfWeek.equals("Saturday")) {
                System.out.println("Weekend chill out,enjoy");
            } else {
                System.out.println("lazy day rest for day");
            }
        } else{
            System.out.println("its a weekday please work");
            {
             if (dayOfWeek.equals("Wednesday")||dayOfWeek.equals("Thursday")||dayOfWeek.equals("Friday")) {

                 System.out.println("Chill weekend is on the way");
             }else {
                 System.out.println("Monday and Tuesday hatest day");

             }

        }
        }

    }
}

