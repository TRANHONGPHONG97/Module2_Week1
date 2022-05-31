package exercises.algorithm;

public class BinarySearch {
    // Trả về chỉ mục của x nếu nó có trong arr[l..r]
    // ngược lại trả về -1
    int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // kiểm tra xem x có ở chính giữa không
            if (arr[m] == x)
                return m;

            // Nếu x lớn hơn, bỏ qua nửa bên trái
            if (arr[m] < x)
                l = m + 1;

                // Nếu x nhỏ hơn, bỏ qua nửa bên phải
            else
                r = m - 1;
        }

        // phần tử không tồn tại
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 4, 9, 10, 11, 22, 24, 31, 48, 56, 76, 86};
        int n = arr.length;
        int x = 31;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Phần tử không tồn tại.");
        else
            System.out.println("Phần tử được tìm thấy tại vị trí: " + result);
    }
}
