import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {

    private ArrayList<Integer> arrayList;
    private LinkedList<Integer> linkedList;

    public ListDemo(){
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();

        for(int i = 0; i < 10000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
    }

    public int arrayListGet(){
        int sum = 0;

        for(int i = 0; i < 10000; i++){
            sum += arrayList.get(i);
        }

        return sum;
    }


    public int linkedListGet(){
        int sum = 0;

        for(int i = 0; i < 10000; i++){
            sum += linkedList.get(i);
        }

        return sum;
    }

    public void arrayListRemoveFront() {
        ArrayList<Integer> list = new ArrayList<>(arrayList);
        list.remove(0);
    }

    public void linkedListRemoveFront() {
        LinkedList<Integer> list = new LinkedList<>(linkedList);
        list.remove(0);
    }

    public void arrayListRemoveMiddle() {
        ArrayList<Integer> list = new ArrayList<>(arrayList);
        list.remove(list.size() / 2);
    }

    public void linkedListRemoveMiddle() {
        LinkedList<Integer> list = new LinkedList<>(linkedList);
        list.remove(list.size() / 2);
    }
}

