package education;

public class StudentTest1 {
    public static void main(String[] args) {

        Student arunstudent=new Student();
        Student rakeshstudent=new Student();
        arunstudent.name="govardhan";
        arunstudent.dob="18/04/2003";
        arunstudent.standard="7th";
        arunstudent.father_name="T venkateswarlu";
        arunstudent.ph_no="9989731805";
        arunstudent.address="11-39";

        //Student rakeshstudent=new Student();
        System.out.println("Name of student:"+ arunstudent.name);
        System.out.println("Date of birth :"+ arunstudent.dob);
        System.out.println("standard :"+ arunstudent.standard);
        System.out.println("Father name :"+ arunstudent.father_name);
        //System.out.println("Phone number:"+sc.ph_no);
        //System.out.println("Address:"+sc.address);
System.out.println(arunstudent.school_name);
        System.out.println(rakeshstudent.school_name);



    }



}
