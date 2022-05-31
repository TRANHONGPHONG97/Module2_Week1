package exercises;
public class BoiChungnn {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int temp = 0;
        int bcnn = arr[0] > arr[1] ? arr[0] : arr[1];
        for (int i = 2; i < arr.length; i++) {
            temp = bcnn > arr[i] ? bcnn : arr[i];
            while (true) {
                if (temp % bcnn == 0 && temp % arr[i] == 0) {
                    break;
                }
                temp++;
            }
            bcnn = temp;
        }
        System.out.println(temp);
    }
}







//        Lam theo Ke thua
//        BoichungNN2so bcnhonhat = new BoichungNN2so();
//        bcnhonhat.setA(arr[0]);
//        bcnhonhat.setB(arr[1]);
//        int temp = bcnhonhat.getBCNN(arr[0], arr[1]);
//        for(int i=2;i< arr.length;i++){
//            temp = bcnhonhat.getBCNN(temp, arr[i]);
//        }
//        System.out.println("BOI CHUNG NHO NHAT CUA CAC SO TRONG MANG LA " + temp);
//    }
//}

//      Lam 2 so nguyen
//        Scanner scanner = new Scanner(System.in);
//        int number1, number2, bcnn;
//        System.out.println("Nhap so thu nhat: ");
//        number1 = scanner.nextInt();
//        System.out.println("Nhap so thu hai: ");
//        number2 = scanner.nextInt();
//
//        bcnn = (number1 > number2) ? number1 : number2;
//        while (true) {
//            if (bcnn % number1 == 0 && bcnn % number2 == 0) {
//                System.out.println("Boi chung nho nhat la: " + bcnn);
//                break;
//            }
//            bcnn++;

