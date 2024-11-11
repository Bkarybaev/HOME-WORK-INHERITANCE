public class Main {
    public static void main(String[] args) {

        Person programmer = new Programmer("Aibek","programmer","google");
        Person dancer = new Dancer("Ernist","dancer","BTS");
        Person singer = new Singer("Amir","Sinder","Biz tobu");
        Object[] objects = new Person[]{programmer,dancer,singer};
        for (Object object : objects) {
            System.out.println(object.toString());
        }

    }
}