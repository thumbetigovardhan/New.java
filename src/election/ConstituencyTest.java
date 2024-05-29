package election;

public class ConstituencyTest {
    public static void main(String[] args) {


        ElectionService ec = new ElectionService();
        State test=ec.getstate();
        System.out.println(test.constituency.constituencyName);
        System.out.println(test.constituency.type);
        System.out.println(test.constituency.no_of_voters);


    }





}
