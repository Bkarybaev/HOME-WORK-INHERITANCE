public class Programmer extends  Person{
    private String companyName;

    public Programmer(){}


    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }


    public String coding(){
        return super.getName()+" is coding at " + companyName;
    }

    @Override
    public String toString() {
        return "Programmer : " +
                super.toString() +"\n" +coding()+"\n"

                ;
    }
}
