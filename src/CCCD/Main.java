package CCCD;

public class Main {
    public static void main(String[] args) {
        CongDanUS cdUS = new CongDanUS();
        CongDanVN cdVN = new CongDanVN();
        CongAn congAn = new CongAn();
        congAn.capCanCuocCongDan(cdUS);
        congAn.capCanCuocCongDan(cdVN);
    }
}
