import java.util.List;

public class Filters {
    public static void main(String[] args) {
        List<String> cats = List.of("Tiger", "Lion", "Cheetah");
        String search="tiger";
        String tigers=cats.stream()
                .filter(cat -> cat.equalsIgnoreCase(search))
                .findFirst()
                .orElse(null);
        System.out.println(tigers);
    }
}
