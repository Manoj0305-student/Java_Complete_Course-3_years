package OOPs;

/* Hiding internal data using the private variables having controlled access
to user through the public methods that is getter and setter method is known as
Encapsulation
 */
public class Material {

    private String materialID;
    private double emissionFactor;

    Material(String materialId, double newFactor) {

        this.materialID = materialId;
        this.emissionFactor = newFactor;

    }

    public String getMaterialId() {
        return materialID;
    }

    public double getEmissionFactor() {
        return emissionFactor;
    }

    public boolean setEmissionFactor(double newFactor) {
        if(newFactor < 0 || newFactor > 1000) {
            System.out.println("Error: Emmission Fcator should be in between 0 to 1000");
            return false;
        }
        this.emissionFactor = newFactor;
        System.out.println("Success: The new Emission Factor is: "+newFactor);
        System.out.println(materialID);
        return true;
    }

    public static void main(String[] args) {
       Material encap = new Material("Mat001", 100);

       encap.setEmissionFactor(1000);
    }
    
}
