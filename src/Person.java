public class Person {
    private String name;
    private String designation;

    public Person(){}

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String learn(){
        return name + " is learning ";
    }
    public String Walk(){
        return name + " is walking ";
    }
    public String eat(){
        return name + " is eating ";
    }

    @Override
    public String toString() {
        return " " +"\n" +
                learn() + "\n" +Walk() + "\n" +eat()
                ;
    }
}
