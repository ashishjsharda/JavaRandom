public class SwitchEx {
    public static void main(String[] args) {
        String day="Sun";
        var res=switch (day){
            case "Mon":
            case "Tue":
            case "Wed":yield "Weekday";
            default:yield "Weekend";
        };

        System.out.println(res);
    }
}
