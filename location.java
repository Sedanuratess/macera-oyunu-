package location;
import java.util.Scanner;

public abstract class location {
    private int id;
    private player Player;
    private String name;
    private boolean selectCombatValue = false;
    public static Scanner scanner = new Scanner(System.in);

    public Location(int id, player Player, String name) {
        this.id = id;
        this.Player = Player;
        this.name = name;
    }

    abstract boolean onLocation();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public player getPlayer() {
        return player;
    }

    public void setPlayer(player Player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelectCombatValue() {
        return selectCombatValue;
    }

    public void setSelectCombatValue(boolean selectCombatValue) {
        this.selectCombatValue = selectCombatValue;
    }
}
