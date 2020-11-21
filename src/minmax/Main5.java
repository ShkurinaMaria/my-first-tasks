package minmax;

public class Main5 {
    public static void main(String[] args) {
        Volume[] volume = new Volume[]{
                new Volume(5, 10),
                new Volume(4, 10),
                new Volume(8, 20),
        };
        System.out.println(volume(volume));
    }

    static float volume(Volume [] arr) {
        float max = arr[0].getA() / arr[0].getB();

        for (int i = 0; i < arr.length; i++) {
            float m = arr[i].getA();
            float v = arr[i].getB();
            float p = ((float) m / v);
            if (p > max) {
                max =  p;
            }
        }
        return max;
    }
}

class Volume {
    private float m;
    private float v;

    public Volume(int m, int v) {
        this.m = m;
        this.v = v;
    }

    public float getA() {
        return m;
    }

    public float getB() {
        return v;
    }
}