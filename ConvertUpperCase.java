import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Convert elements of list to uppercase
 * @author ashish
 */
public class ConvertUpperCase {
    public static void main(String[] args) {
        String [] colors={"red","blue","black","white"};
        List list=new LinkedList();
        for(String color:colors){
            list.add(color);
        }
        //Convert List to Uppercase
        ListIterator<String> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            String color=listIterator.next().toUpperCase();
            listIterator.set(color);
        }
        //Print Contents of List
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));

        }
    }


}
