package Objects.GameObjects.Player.Components;

public class Engine extends Component{
    private float thrust = 0;
    private float cost = 0;
    private float mass = 0;
    private float turnRate = 0;

    public Engine(Level level){
        super(level);
    }

    public float getThrust() {
        switch (level){
            case basic:
                thrust = 2;
                break;
            case advanced:
                thrust = 5;
                break;
            case elite:
                thrust = 10;
                break;
            case absurd:
                thrust = 50000;
                break;
        }

        return thrust;
    }

    public float getCost() {
        switch (level){
            case basic:
                cost = 1000;
                break;
            case advanced:
                cost = 2000;
            case elite:
                cost = 3400;
                break;
            case absurd:
                cost = 10000;
                break;
        }
        return cost;
    }

    public float getMass() {
        switch (level){
            case basic:
                mass = 100;
                break;
            case advanced:
                mass = 120;
                break;
            case elite:
                mass = 140;
                break;
            case absurd:
                mass = 0;
                break;
        }
        return mass;
    }

    public float getTurnRate(){
        switch (level){
            case basic:
                turnRate = 15f/1000;
                break;
            case advanced:
                turnRate = 30f/1000;
                break;
            case elite:
                turnRate = 50f/1000;
                break;
            case absurd:
                turnRate = 100f/1000;
                break;
        }
        return turnRate;
    }
}
