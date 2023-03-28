import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

class requirements {
    requirements(messages mName1, String pType, messages mName2){
        paralelltype = pType;
        messageName1 = mName1.name;
        messageName2 = mName2.name;
    }
    String paralelltype;
    String messageName1;
    String messageName2;
}

class messages {
    String name;

    boolean selfLoop = false;

    messages(String names){
        name = names;
    }
}
public class SortingAlgorithm {


    ArrayList<ArrayList<messages>> ListBehaviours = new ArrayList<>();
    void SortingBehaviours(ArrayList<messages> listOfMessages,ArrayList<requirements> listOfReq) {
        ArrayList<ArrayList<messages>> markedSets = new ArrayList<>();
        markedSets.add(listOfMessages);

        for (int i = 0; i < listOfReq.size(); i++){
            ArrayList<ArrayList<messages>> newMarkedSet = new ArrayList<>();
            for(int j = 0; j < markedSets.size(); j++){
                ArrayList markedSet = markedSets.get(j);
                requirements marking = listOfReq.get(j);

                String markedElement1 = marking.messageName1;
                String markedElement2 = marking.messageName2;

                var unMarkedElements1 = markedSet.stream().filter(element -> element != markedElement1);
                var unmarkedElements2 = markedSet.stream().filter(element -> element != markedElement2);
                ArrayList<String> markedSubSet1 = new ArrayList<>();
                markedSubSet1.add(markedElement1);
                markedSubSet1.add(unMarkedElements1.toString());

                ArrayList<String> markedSubSet2 = new ArrayList<>();
                markedSubSet2.add(markedElement2);
                markedSubSet2.add(unmarkedElements2.toString());


                newMarkedSet.add(markedSubSet1);
                newMarkedSet.add(markedSubSet2);


            }
            markedSets = newMarkedSet;
        }

    


    }
}
