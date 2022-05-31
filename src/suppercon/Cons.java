package suppercon;
import suppercha.Cha;

    class Child extends Cha{
        public String name = "Minh";

        public void Info1() {
            // Sử dụng từ khóa super
            System.out.println(super.name);
            // Không sử dụng từ khóa super
            System.out.println(name);
        }

        public void Info2() {
            System.out.println("Nơi ở: " + address);

        }
        public static void main(String[] args) {
            Child child = new Child();
            child.Info1();
            child.Info2();
        }
    }


