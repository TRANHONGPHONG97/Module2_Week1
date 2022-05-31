package exercises.abstract1;

abstract class Tiger {
    abstract void run();

}
class Lion extends Tiger {
    @Override
    void run() {
        System.out.println("Run fast");
    }

    public static void main(String[] args) {
        Tiger tiger = new Lion();
        tiger.run();
    }
}
