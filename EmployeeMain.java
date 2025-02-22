public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Akarsh","shetty",'M',30);
        Employee employee2 = new Employee("Sowmya","shetty",'f',27);
        Employee employee3=new Employee();



        /*employee.firstName="Akarsh";
        employee.lastName="shetty";
        employee.gender='m';
        employee.age=30;*/
        System.out.println(employee1.getAge());
        System.out.println(employee1.getGender());
        System.out.println(employee2.getAge());
        System.out.println(employee2.getGender());
        System.out.println(employee3.getAge());
        System.out.println(employee3.getGender());
        System.out.println(Employee.EMPLOYER_NAME);




    }
}
