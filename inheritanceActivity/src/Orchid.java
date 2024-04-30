public class Orchid extends Flower{
    String orchidType;
    public Orchid(String name, String color, int numOfPetals, double height, String orchidType){
        super(name, color, numOfPetals, height);
        this.orchidType = orchidType;
    }
    @Override
    public String toString(){
        return String.format("The orchid type %s: ", orchidType);
    }
}