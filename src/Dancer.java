public class Dancer extends  Person{
    private String croupName;

    public Dancer() {
    }

    public Dancer(String name, String designation, String croupName) {
        super(name, designation);
        this.croupName = croupName;
    }
    public String dancing(){
        return super.getName()+" is dancing with " + croupName;
    }

    @Override
    public String toString() {
        return "Dancer : " +
                super.toString() + "\n" +
                dancing()+"\n"
                ;
    }
}
