import java.util.ArrayList;
import java.util.List;

class requirements {
    requirements(Message mName1, String pType, Message mName2){
        paralelltype = pType;
        messageName1 = mName1;
        messageName2 = mName2;
    }
    String paralelltype;
    Message messageName1;
    Message messageName2;
}

class Message {
    String name;

    boolean selfLoop = false;

    Message(String s) {
        name = s;
    }

    @Override
    public String toString() {
        if (selfLoop) return "*" + this.name + "*";
        else return this.name;
    }

    void setSelfLoop(boolean b) {
        this.selfLoop = b;
    }
}
public class SortingAlgorithm {
    public static ArrayList<ArrayList<Message>> markSets(ArrayList<Message> S, ArrayList<ArrayList<Message>> markings) {
        ArrayList<ArrayList<Message>> markedSets = new ArrayList<>();
        markedSets.add(S);

        for (int i = 0; i < markings.size(); i++) {
            ArrayList<ArrayList<Message>> newMarkedSets = new ArrayList<>();

            for (int j = 0; j < markedSets.size(); j++) {
                ArrayList<Message> markedSet = markedSets.get(j);
                ArrayList<Message> marking = markings.get(i);

                Message markedElement1 = marking.get(0);
                Message markedElement2 = marking.get(1);

                ArrayList<Message> unmarkedElements1 = new ArrayList<>();
                ArrayList<Message> unmarkedElements2 = new ArrayList<>();

                for (int k = 0; k < markedSet.size(); k++) {
                    Message element = markedSet.get(k);

                    if (element != markedElement1) {
                        unmarkedElements1.add(element);
                    }

                    if (element != markedElement2) {
                        unmarkedElements2.add(element);
                    }
                }

                ArrayList<Message> markedSubset1 = new ArrayList<>();
                ArrayList<Message> markedSubset2 = new ArrayList<>();

                markedSubset1.add(markedElement1);
                markedSubset1.addAll(unmarkedElements2);

                markedSubset2.add(markedElement2);
                markedSubset2.addAll(unmarkedElements1);

                newMarkedSets.add(markedSubset1);
                newMarkedSets.add(markedSubset2);
            }

            markedSets = newMarkedSets;
        }
        for (ArrayList<Message> r : markedSets) {
            for (Message inM : r) {
                System.out.print(inM.name + ", ");
            }
            System.out.println();
        }

        return markedSets;
    }
}