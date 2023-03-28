import java.util.ArrayList;

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


    ArrayList<ArrayList<Message>> ListBehaviours = new ArrayList<>();
    void SortingBehaviours(ArrayList<Message> listOfMessages, ArrayList<requirements> listOfReq) {
        ArrayList<ArrayList<Message>> markedSets = new ArrayList<>();
        markedSets.add(listOfMessages);

        for (int i = 0; i < listOfReq.size(); i++){
            ArrayList<ArrayList<Message>> newMarkedSet = new ArrayList<>();
            for(int j = 0; j < markedSets.size(); j++){
                ArrayList<Message> markedSet = markedSets.get(j);
                requirements marking = listOfReq.get(j);

                Message markedElement1 = marking.messageName1;
                markedElement1.setSelfLoop(true);
                Message markedElement2 = marking.messageName2;
                markedElement2.setSelfLoop(true);

                var unMarkedElements1 = markedSet.stream().filter(element -> element != markedElement1);
                var unmarkedElements2 = markedSet.stream().filter(element -> element != markedElement2);
                ArrayList<Message> markedSubSet1 = new ArrayList<>();
                markedSubSet1.add(markedElement1);
                markedSubSet1.addAll(unMarkedElements1.toList());

                ArrayList<Message> markedSubSet2 = new ArrayList<>();
                markedSubSet2.add(markedElement2);
                markedSubSet2.addAll(unmarkedElements2.toList());


                newMarkedSet.add(markedSubSet1);
                newMarkedSet.add(markedSubSet2);

                markedElement1.setSelfLoop(false);
                markedElement2.setSelfLoop(false);

            }
            markedSets = newMarkedSet;
        }

        for(ArrayList<Message> mes : markedSets) {
            for (Message message : mes) {
                System.out.print(message.toString() + ", ");
            }

            System.out.println();
        }




    }
}
