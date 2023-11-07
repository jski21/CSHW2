
public class ChinchillaZone implements Zoneable {
    // Constructor
    public ChinchillaZone(String name, Coord2D location) {
        // Empty body
    }
    
    // Implement all methods from Zoneable with empty bodies
    public String getName() {
        // Empty body
        return "";
    }
    
    public Coord2D getLocation() {
        // Empty body
        return null;
    }

    @Override
    public int petsInZone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'petsInZone'");
    }

    @Override
    public Petable heaviestPet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'heaviestPet'");
    }

    @Override
    public int inHumanYears(String petName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inHumanYears'");
    }

    @Override
    public Zoneable restockPetFood(String foodName, int foodAmt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'restockPetFood'");
    }

    @Override
    public Zoneable feedZone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'feedZone'");
    }

    @Override
    public Petable getPet(String petName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPet'");
    }

    @Override
    public String getPantryLabel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPantryLabel'");
    }

    @Override
    public String closestPet(int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'closestPet'");
    }
}
