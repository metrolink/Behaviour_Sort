import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        messageRes mes1 = new messageRes("A","||", "B");
        messageRes mes2= new messageRes("A","||", "C");
        messageRes mes3= new messageRes("C","||", "D");
        messageRes mes4= new messageRes("B","||", "E");
        messageRes mes5= new messageRes("B","~||", "D");
        messageRes mes6= new messageRes("B","||", "F");
        messageRes mes7= new messageRes("A","~||", "G");

        List<messageRes> a = new ArrayList<messageRes>();
        a.add(mes1);
        a.add(mes2);
        a.add(mes3);
        a.add(mes4);
        a.add(mes5);
        a.add(mes6);
        a.add(mes7);


        SortingAlgorithm sortin = new SortingAlgorithm();

        sortin.SortingBehaviours(a);



        //s.SortingBehaviours(Behaviours);

        System.out.println("Hello world!");
    }
}