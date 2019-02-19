package Objects.GameObjects.Player.Components;

import java.util.Map;

public abstract class Component {
    protected Level level;

    Component(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
