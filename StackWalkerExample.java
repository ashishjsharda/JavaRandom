import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StackWalkerExample {

    public static void main(String[] args) {
        printStackTrace();
    }

    private static void printStackTrace() {
        StackWalker stackWalker = StackWalker.getInstance();

        // Get the stack trace as a stream
        List<StackWalker.StackFrame> stackFrames = stackWalker.walk(
                stream -> stream.collect(Collectors.toList())
        );
        stackFrames.forEach(frame->{
            System.out.println( frame.getMethodName() + " " + frame.getLineNumber());
        });
    }
}
