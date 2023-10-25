package org.example;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> novalue=Optional.empty();
        Optional<String> hasvalue=Optional.of("Hello");
        if(novalue.isPresent()){
            System.out.println("This will not be printed");
        }
        else{
            System.out.println("Novalue is empty");
        }
        if(hasvalue.isPresent()){
            System.out.println("The value in hasvalue is:"+hasvalue.get());
        }
    }
}
