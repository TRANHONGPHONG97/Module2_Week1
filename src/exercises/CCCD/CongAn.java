package CCCD;

public class CongAn {
    void capCanCuocCongDan(ICapCanCuocCongDan congdan){
        if(congdan.getSoHK()==null){
            System.out.println("Can co so ho khau");
            return;
        }
        if (congdan.getCMND()== null){
            System.out.println("Can co chung minh dan dan");
            return;
        }
        System.out.println("Xac minh giay to lien quan");
        System.out.println("Cap can cuoc cong dan hoan thanh");
//        CCCD cccd = new CCCD();
    }
}
