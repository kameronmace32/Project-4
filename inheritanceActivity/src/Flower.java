public class Flower
{
    //------------Instant Field/Variables/Member Variables ------------------------------
    protected String name, color;
    protected int numOfPetals;
    protected double height;


    //------------------------Constructor ---------------------------------------------
    public Flower(String name, String color, int numOfPetals, double height) {
        this.name = name;
        this.color = color;
        this.numOfPetals= numOfPetals;
        this.height = height;

    }

    //----------------------------------- Setters (Mutators) ------------------------------

    public void setName(String Name) {
        this.name = Name;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public void setNumOfPetals(int NumOfPetals) {
        this.numOfPetals = NumOfPetals;
    }

    public void setHeight(double Height) {
        this.height = Height;
    }

    //----------------------------------- GETTERS (ACCESSORS) ------------------------------
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getNumOfPetals() {
        return numOfPetals;
    }

    public double getHeight() {
        return height;
    }

    //----------------------------------- OBJECT BEHAVIORS (METHODS) ------------------------------
    public void bloom() {
        System.out.println(name + " is blooming!");
    }

    public void wilt() {
        System.out.println(name + " is wilting.");
    }

    public void grow() {
        System.out.println("Initial growth");
    }


    //ToString method
    // The @Override keyword is used in Java to indicate that a method declaration
    // is intended to override a method with the same signature in a superclass or interface.

    @Override
    public String toString(){
        return String.format("The Flower: %s  Color: %s  # of petals: %d Height: %.2f",name,color,numOfPetals,height);
    }
}

