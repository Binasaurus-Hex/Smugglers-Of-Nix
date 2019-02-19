package Objects.GameObjects.Player;

import Objects.GameObjects.Player.Components.*;

public class Ship {
    public Engine engine;
    public Hull hull;
    public Jumpdrive jumpdrive;
    public Shield shield;
    public Weapon weapon;

    public Ship(){
        engine = new Engine(Level.elite);
    }
}
