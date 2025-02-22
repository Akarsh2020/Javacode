public class EmployeMain {

    public static void main(String[] args) {
        Employe myObjt=new Employe("Akarsh","shetty",'M',(byte)30);
        Employe myobjt2=new Employe("sowmya","shety",'F',(byte)27);

//        myObjt.firstName="Akarsh";
//        myObjt.lastName="shetty";
//        myObjt.gender='M';
//        myObjt.age=30;

        System.out.println(myObjt.getAge());
        System.out.println(myObjt.getGender());
        System.out.println(myObjt.getFirstName());
        System.out.println(myObjt.getlastName());

        System.out.println(myobjt2.getFirstName());
        System.out.println(myobjt2.getlastName());
    }
}
