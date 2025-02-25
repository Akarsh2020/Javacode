public class Employee {
   String firstName;
   String lastName;
   char gender;
   int age;
   static final String EMPLOYER_NAME = "HCL";



   public Employee()
   {
      this("hi","hello",'f',30);

      System.out.println("defult constructor");

   }



   public  Employee(String firstName,String lastName,char gender,int age  )
   {
      this.firstName=firstName;
      this.lastName=lastName;
      this.gender=gender;
      this.age=age;
      System.out.println("overloaded constructor");
   }

   public int getAge()
   {
      return age;
   }
   public char getGender()
   {
      return gender;
   }
}
