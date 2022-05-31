package loop;

public class IsPrime100 {
    public static void main(String[] args) {

//        for (int i = 2 ; i <=100; i++ ) {
//            boolean flag = true;
//            for (int j = 2; j < i ; j++) {
//                if (i % j == 0) {
//                    flag = false;
//                }
//            }
//
//            if (flag) {
//                System.out.printf("%d ",i);
//            }
//        }
//
//    }
//}
        for (int i = 1; i <= 100; i++) {
            if (isPremeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPremeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

