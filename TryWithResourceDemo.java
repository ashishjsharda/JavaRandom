import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/** Demo using Try with Resources
 * @author ashish
 *
 */
public class TryWithResourceDemo {

	public static void main(String[] args)  {

		try(PrintWriter pw=new PrintWriter(new File("text.txt"));)
		{
			pw.write("text");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}

	}

}
