package JDK13;

public class Java13Demo {

    enum Day {
        SUN, MON, TUE
    };
    @SuppressWarnings("preview")
	public static  String getDay(Day d)
    {
        String day=switch(d){
            case SUN ->"Sunday";
            case MON ->"Monday";
            case TUE -> "Tuesday";
        };

        return day;
    }
    public static void main(String[] args) {

    	System.out.println(getDay(Day.SUN));
    }
}
