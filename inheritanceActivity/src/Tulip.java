public class Tulip extends Flower{
    String tulipType;
    public Tulip(String name, String color, int numOfPetals, double height, String tulipType) {
        super(name, color, numOfPetals, height);
        this.tulipType = tulipType;
    }
    @Override
    public String toString(){
        return String.format("Tulip type %s: ", tulipType);
    }
}
