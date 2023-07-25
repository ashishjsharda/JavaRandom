import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> arr=new Vector<Integer>();
        Vector<Integer> arr1=new Vector<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr1.add(6);
        arr1.add(7);
        arr1.add(8);
        arr1.add(9);
        arr1.add(10);

        Vector<Integer> arr2=new Vector<Integer>();
        for (int i=0;i<arr.size();i++) {
            arr2.add(arr.get(i) + arr1.get(i));
        }

        for (Integer integer : arr2) {
            System.out.println(integer);
        }

    }

}
