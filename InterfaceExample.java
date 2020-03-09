interface Car{
    default void print()
    {
        System.out.println("In car interface");
    }
}

interface Tesla{
    static void print(){
        System.out.println("In Tesla");
    }
}
public class InterfaceExample implements Car,Tesla {
    public static void main(String[] args) {
        InterfaceExample interfaceExample=new InterfaceExample();
        interfaceExample.print();
        Tesla.print();

    }
}
