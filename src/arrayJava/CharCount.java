package ArrayJava;

public class CharCount {
    public static void main(String[] args) {
        String str = "Tran Hong Phong";
        char x = 'n';
        int count = 0;
        for (int i =0; i < str.length(); i++){
            if (str.charAt(i) == x)
                count = count + 1;
        }
        System.out.printf("So lan ki tu xuat hien %d ", count);
    }
}
