/**
 * Memoization
 * @author ashish
 */
public class Memoization {

    public int fibonnaci(int num){
        return fibonnaci(num,new int[num+1]);
    }

    private int fibonnaci(int num, int[] cache) {
        if(num<=1){
            return num;
        }
        else if(cache[num]>0){
            return cache[num];
        }
        cache[num]=fibonnaci(num-2,cache) +fibonnaci(num-1,cache);
        return cache[num];
    }


    public static void main(String[] args) {
        Memoization memoization=new Memoization();
        System.out.println(memoization.fibonnaci(3));

    }
}
