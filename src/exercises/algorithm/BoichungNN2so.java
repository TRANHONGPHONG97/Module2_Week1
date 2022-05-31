package exercises.algorithm;

public class BoichungNN2so {
    private int a = 1;
    private int b = 1;

    public BoichungNN2so(){

    }

    public BoichungNN2so(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getBCNN(int a, int b) {
        int bcnn = (a > b) ? a : b;

        while (true) {
            if (bcnn % a == 0 && bcnn % b == 0) {
                break;
            }
            bcnn++;
        }

        return bcnn;
    }
}
