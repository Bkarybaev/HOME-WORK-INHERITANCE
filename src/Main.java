public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Aibek","programmer","google");
        Dancer dancer = new Dancer("Ernist","dancer","BTS");
        Singer singer = new Singer("Amir","Sinder","Biz tobu");
        Object[] objects = new Person[]{programmer,dancer,singer};
        for (Object object : objects) {
            System.out.println(object.toString());
        }

    }
}