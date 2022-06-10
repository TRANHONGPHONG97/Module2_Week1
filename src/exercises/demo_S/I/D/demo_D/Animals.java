package exercises.demo_S.I.D.demo_D;

import exercises.demo_S.I.D.demo_D_1.TerrestrialAnimals;

public class Animals {
    private String TerrestrialAnimals;
    private String UnderwaterAnimals;

    public Animals() {
        TerrestrialAnimals terrestrialAnimals = new TerrestrialAnimals();
        UnderwaterAnimals underwaterAnimals = new UnderwaterAnimals();
    }
}
// Ví dụ về class là Animals bao gồm có 2 đối tượng là:
// động vật trên cạn và động vật dưới nước.
// Ví dụ trên ta thấy trong constructor của Animals ta tạo 2 đối tượng là:
// new TerrestrialAnimals và new UnderwaterAnimals, như vậy vô tình ta tạo ra
// 3 đối tượng Animals, TerrestrialAnimals, UnderwaterAnimals dính chặt với nhau, phụ thuộc lẫn nhau.
// Ví dụ như muốn thay TerrestrialAnimals củ bằng một TerrestrialAnimals mới cũng không được
// vì nó đã là một phần của Animals.
//Để giảm sự phụ thuộc này, ta tạo ra một interface riêng như sau:
