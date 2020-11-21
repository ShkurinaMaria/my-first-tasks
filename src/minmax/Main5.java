package minmax;

public class Main5 {
    public static void main(String[] args) {
        Volume[] volume = new Volume[]{
                new Volume(5, 10),
                new Volume(4, 10),
                new Volume(8, 10),
        };
        System.out.println(volume(volume));
    }

    static float volume(Volume[] arr) {
        float max = arr[0].getVolume();

        for (Volume volume : arr) {
            float p = volume.getVolume();
            if (p > max) {
                max = p;
            }
        }
        return max;
    }
}

class Volume {
    private final float m;
    private final float v;

    public Volume(int m, int v) {
        this.m = m;
        this.v = v;
    }

    float getVolume() {
        return m / v;
    }
}