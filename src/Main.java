import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {



        Message m1 = new Message("A");
        Message m2 = new Message("B");
        Message m3 = new Message("C");
        Message m4 = new Message("D");
        ArrayList<Message> b = new ArrayList<Message>();
        b.add(m1);
        b.add(m2);
        b.add(m3);
        b.add(m4);


        requirements mes1= new requirements(m2,"~||", m3);
        requirements mes2= new requirements(m1,"~||", m3);

        ArrayList<requirements> listOfRequirements = new ArrayList<requirements>();
        listOfRequirements.add(mes1);
        listOfRequirements.add(mes2);

        SortingAlgorithm sortin = new SortingAlgorithm();

        sortin.SortingBehaviours(b,listOfRequirements);



        //s.SortingBehaviours(Behaviours);

        //System.out.println("Hello world!");
    }
}