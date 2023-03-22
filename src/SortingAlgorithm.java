import java.util.ArrayList;
import java.util.List;

class messageRes {
    messageRes(String mName1, String pType, String mName2){
        paralelltype = pType;
        messageName1 = mName1;
        messageName2 = mName2;
    }
    String paralelltype;
    String messageName1;
    String messageName2;
}
public class SortingAlgorithm {


    List<List<String>> ListBehaviours = new ArrayList<>();
    void SortingBehaviours(List<messageRes> a) {
        ListBehaviours.add(new ArrayList<>());
        ListBehaviours.add(new ArrayList<>());
        ListBehaviours.add(new ArrayList<>());
        ListBehaviours.add(new ArrayList<>());
        for(int i = 0; i < a.size();) {
            for (messageRes mess : a) {
                if (mess.paralelltype == "~||") {
                    if(ListBehaviours.get(i).contains(mess.messageName1)) {
                        ListBehaviours.get(i).remove(mess.messageName1);
                        ListBehaviours.add(new ArrayList<>());
                        ListBehaviours.get(i+1).add(mess.messageName1);
                    }
                    i++;
                } else if (mess.paralelltype == "||") {
                    if(!ListBehaviours.get(i).contains(mess.messageName1))
                    ListBehaviours.get(i).add(mess.messageName1);
                    if(!ListBehaviours.get(i).contains(mess.messageName2))
                    ListBehaviours.get(i).add(mess.messageName2);
                }
            }
        }
        for(List<String> lb: ListBehaviours) {
            for (String as : lb) {
                System.out.print(as + " ");
            }
            System.out.println();
        }
    }
}
