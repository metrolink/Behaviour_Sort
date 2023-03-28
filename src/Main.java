import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {



        messages m1 = new messages("A");
        messages m2 = new messages("B");
        messages m3 = new messages("C");
        messages m4 = new messages("D");
        messages m5 = new messages("E");
        messages m6 = new messages("F");
        messages m7 = new messages("G");
        ArrayList<messages> b = new ArrayList<messages>();
        b.add(m1);
        b.add(m2);
        b.add(m3);
        b.add(m4);
        b.add(m5);
        b.add(m6);
        b.add(m7);

        requirements mes1= new requirements(m2,"~||", m4);
        requirements mes2= new requirements(m1,"~||", m7);

        ArrayList<requirements> listOfRequirements = new ArrayList<requirements>();
        listOfRequirements.add(mes1);
        listOfRequirements.add(mes2);

        SortingAlgorithm sortin = new SortingAlgorithm();

        sortin.SortingBehaviours(b,listOfRequirements);



        //s.SortingBehaviours(Behaviours);

        //System.out.println("Hello world!");
    }
}