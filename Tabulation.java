/**
 * Fibonnaci example
 * @author ashish
 */
public class Tabulation {

    int fibonnaci(int num)
    {
        if(num<=1)
        {
            return num;
        }
        int first=1;
        int second=0;
        int result=0;

        for(int i=1;i<num;i++){
            result=first+second;

            second=first;
            first=result;

        }
        return result;

    }
    public static void main(String[] args) {

        Tabulation tabulation=new Tabulation();
        System.out.println(tabulation.fibonnaci(3));
    }
}
