
public class Bird implements Petable {
    // Constructor
    public Bird(String name, Coord2D location) {
        // Empty body
    }
    
    // Implement all methods from Petable with empty bodies
    public void moveTo(Coord2D newLocation) {
        // Empty body
    }
    
    public String makeSound() {
        // Empty body
        return "";
    }
    
    public String getName() {
        // Empty body
        return "";
    }
    
    public Coord2D getLocation() {
        // Empty body
        return null;
    }

    @Override
    public int getWeightInOz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWeightInOz'");
    }

    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAge'");
    }

    @Override
    public int eats(String foodLabel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eats'");
    }
}
