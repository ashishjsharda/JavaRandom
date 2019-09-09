package Java12;
import java.util.Comparator;
import java.util.TreeSet;

/**
  * Implement Custom Comparator
  * @author asharda
  *
  */

public class MyComparator implements Comparator<String> {

  public static void main(String[] args) {

  TreeSet<String> ts=new TreeSet<String>(new MyComparator());
  ts.add("A");
  ts.add("B");
  ts.add("C");
  ts.add("D");

  for(String s:ts)
{
  System.out.println(s);
}

}

  /**
    * Override Custom Comparator
    */
  @Override
  public int compare(String aStr, String bStr) {

  return bStr.compareTo(aStr);
}

}
