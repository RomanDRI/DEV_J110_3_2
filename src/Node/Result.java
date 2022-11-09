package Node;
import java.util.Arrays;
import java.util.List;

public class Result {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        List<Integer> collection = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Integer[] array = {25,26,27,28,29,30};
        List<Integer> collection1 = Arrays.asList(10,11,12,13,14,15,16);
        list.addTailCollection(collection);
        list.listPrintRevers();
        System.out.println("_____");
        list.replaceList(collection, collection1);
        list.listPrint();
        System.out.println("_____");
        list.addHeadArray(array);
        list.listPrint();
    }
}
