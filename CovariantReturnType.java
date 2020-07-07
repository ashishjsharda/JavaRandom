package CompleteReference;

/**
 * Example using CovariantReturnType
 * @author ashish
 */
class Testing{
   Testing get(){
       return this;
   }
}
public class CovariantReturnType  extends Testing{

    CovariantReturnType get(){
        return  this;
    }

    public void hello(){
        System.out.println("HI ,This is example of Covariant return type");
    }
    public static void main(String[] args) {

        new CovariantReturnType().get().hello();
    }
}
