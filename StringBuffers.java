/**
 * Reverse a string using Java
 * @author ashish
 */
public class StringBuffers {
    public static void main(String[] args) {
        String string="Hello I am your String";
        String[] arr=string.split(" ");
        String reverse="";
        for(int i=arr.length-1;i>=0;i--)
        {
            reverse=reverse+arr[i];
        }
        System.out.println("Reversed String seen is " + reverse);

    }
}
