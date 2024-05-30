package family;

public class TressTest {

    public static void main(String [] args) {
        Family a = new Family();
        Address aAddress=new Address();
        aAddress.area="GNT";
        aAddress.city="GNT";
        aAddress.pinCode=522006;
        aAddress.flatNo="501";
        aAddress.name="A";
        a.address=aAddress;
        Family[] aKids=new Family[2];
        Family b = new Family();
        Address baAddress = new Address();
        baAddress.area="GNT";
        baAddress.city="GNT";
        baAddress.pinCode=522006;
        baAddress.flatNo="501";
        baAddress.name="A";



    }
}
