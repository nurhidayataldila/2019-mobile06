package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {
    private float mass;
    private float height;
    private float index;

    public BodyMassIndex(float mass, float height) {
        this.mass = mass;
        this.height = height;
        this.index = calculate();
    }

    public float getIndex() {
        return index;
    }

    private float calculate() {
        float output = (float) (this.mass/Math.pow(this.height, 2f));
        return output;
    }
}
