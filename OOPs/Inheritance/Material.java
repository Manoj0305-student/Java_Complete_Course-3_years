package OOPs.Inheritance;

/*
    Copying the properties and methods from parent class to it's base class 
    with help extend keyword, if needed changing it's method or override parent
    properties is known as inheritance.

 */
public class Material {

    private String name;
    private double weight;
    private double emissionFactor;

    public Material(String name, double weight, double emissionFactor) {

        this.name = name;
        this.weight = weight;
        this.emissionFactor = emissionFactor;

    }

    public double calculateEmissionFactor() {
        return weight*emissionFactor;
    }

}

class RawMaterial extends Material {

public RawMaterial(String name, double weight, double emissionFactor) {
    super(name, weight, emissionFactor);
}

}

class RecycledMaterial extends Material {

    private double recyclingBonus;

    public RecycledMaterial(String name, double weight, double emissionFactor) {
        super(name, weight, emissionFactor);
    }

    @Override
    public double calculateEmissionFactor() {
        double result = super.calculateEmissionFactor();
        return result * (1-this.recyclingBonus);
    }


}