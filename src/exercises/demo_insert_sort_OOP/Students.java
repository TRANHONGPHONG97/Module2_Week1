package exercises.demoOOP;

import java.util.Arrays;

public class Students implements Comparable<Students> {
    private int id;
    private String name;
    private int age;
    private double weight;
    private String address;

    public Students(int id, String name, int age, double weight, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + ", age=" + age;
    }
    @Override
    public int compareTo(Students o) {
        return this.getAge() - o.getAge();
//        return  o.getAge() - this.age;
    }
    public static void main(String[] args) {
        Students[] arr = new Students[5];
        arr[0] = new Students(2, "Trung", 26, 75.5, "Quảng Bình");
        arr[1] = new Students(4, "Phong", 25, 60, "Huế");
        arr[2] = new Students(1, "Lượng", 19, 50, "Dak Lak");
        arr[3] = new Students(5, "Sinh", 22, 73, "Huế");
        arr[4] = new Students(3, "Minh", 27, 45.4, "Huế");
        System.out.println("Trước");
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
                Students key = arr[i];
                int j = i;
                while (j >0 && arr[j].compareTo(arr[j-1]) < 0) {
                    arr[j] = arr[j-1];
                    arr[j - 1] = key;
                    j--;
                }
            }
        System.out.println("Sau");
        System.out.println(Arrays.toString(arr));
    }
}

