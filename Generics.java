public class Generics {

    /**
     * Print Array
     * @param arr
     * @param <E>
     */
    public <E> void show(E[] arr)
    {
        for (E element:arr) {
            System.out.println(element);

        }
    }
    public static void main(String[] args) {

        Generics generics=new Generics();
        Integer arr[]={10,20,30};
        Double []doublesarr={1.0,2.0,3.0};
        generics.show(arr);
        generics.show(doublesarr);
    }
}
