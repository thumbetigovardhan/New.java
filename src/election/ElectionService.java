package election;

public class ElectionService {
    public State getstate() {
        State tg=new State();
        tg.state_name="TG";
        Constituency[] constituencies =new Constituency[2];
        Constituency constituency =new Constituency();
        tg.constituency=constituency;
        constituency.constituencyName="HYD";
        constituency.no_of_voters=10000;
        constituency.type="MP";
        constituency.state=tg;
        constituencies[0]=constituency;
      //  Constituency constituency1 = new Constituency();
        //constituency1.constituencyName="GNT";
       // constituency1.type="MLA";
       // constituencies[1]=constituency1;


return tg;
    }
}
