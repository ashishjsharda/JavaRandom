/**
 * Using 2d Arrays
 * @author ashish
 */
public class Arrays2D {
    public static void main(String[] args) {
        int [][]arr=new int[2][2];
        int count=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=count++;
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(arr[i][j]);
            }
        }


    }
}
