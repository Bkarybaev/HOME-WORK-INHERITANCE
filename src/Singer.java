public class Singer extends  Person{
    private String bandName;

    public Singer() {
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String singing(){
        return super.getName()+" is singing with " + bandName;
    }
    public String playGuitar(){
        return super.getName()+" is playing Guitar with " + bandName;
    }

    @Override
    public String toString() {
        return "Singer : "  +
                super.toString() +"\n" +
                singing()+"\n" +  playGuitar()
                ;
    }
}
