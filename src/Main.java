import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {



        Message a = new Message("A");
        Message b = new Message("B");
        Message c = new Message("C");
        Message d = new Message("D");
        ArrayList<Message> mList = new ArrayList<>();
        mList.add(a);
        mList.add(b);
        mList.add(c);
        mList.add(d);


        ArrayList<Message> res1= new ArrayList<>();
        res1.add(b);
        res1.add(c);
        ArrayList<Message> res2= new ArrayList<>();
        res2.add(a);
        res2.add(d);

        ArrayList<ArrayList<Message>> listOfRequirements = new ArrayList<>();
        listOfRequirements.add(res1);
        listOfRequirements.add(res2);

        SortingAlgorithm sortin = new SortingAlgorithm();

        sortin.markSets(mList,listOfRequirements);



        //s.SortingBehaviours(Behaviours);

        //System.out.println("Hello world!");
    }
}