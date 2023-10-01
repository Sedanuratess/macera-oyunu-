package locations;
import player.*;

public abstract class normalLocations extends Location {
    public NormalLocation(player Player, String name, int id){
        super(Player, name, id);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
