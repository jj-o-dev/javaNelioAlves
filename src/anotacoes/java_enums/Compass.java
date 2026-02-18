package anotacoes.java_enums;

public class Compass {
    private Cardinal direction;

    public Compass(Cardinal direction) {
        this.direction = direction;
    }

    public Cardinal getDirection() {
        return direction;
    }

    public void setDirection(Cardinal direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Compass{" +
                "direction=" + direction +
                '}';
    }
}
