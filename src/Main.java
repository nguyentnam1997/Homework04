import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Khai báo mảng ban đầu
        System.out.print("Mời nhập số phần tử của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "]= ");
            arr[i] = Integer.parseInt(scanner.nextLine());
            System.out.println();
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));
        System.out.println("----------------");
        //Thêm 1 phần tử vào mảng
        System.out.print("Mời nhập phần tử cần thêm: ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.println();
        int[] newArr = new int[n+1];
        do {
            System.out.print("Mời nhập vị trí muốn thêm: ");
            int index = Integer.parseInt(scanner.nextLine());
            if (index > newArr.length) {
                System.out.println("Vị trí không hợp lệ, mời nhập lại");
                continue;
            }
            System.out.println();
            if (index == newArr.length) {
                for (int i = 0; i < index - 1; i++) {
                    newArr[i] = arr[i];
                }
                newArr[index - 1] = m;
                System.out.println("Mảng mới sau khi thêm phần tử: " + Arrays.toString(newArr));
            }
            else {
                for (int i = 0; i < index; i++) {
                    newArr[i] = arr[i];
                }
                newArr[index - 1] = m;
                for (int i = index; i < newArr.length; i++) {
                    newArr[i] = arr[i - 1];
                }
                System.out.println("Mảng mới sau khi thêm phần tử: " + Arrays.toString(newArr));
            }
            break;
        }
        while (true);

        //Đổi chỗ phần tử thứ 2 và thứ 3
        System.out.println("----------Đổi chỗ phần tử thứ 2 và thứ 3---------- ");
        do {
            if (newArr.length <= 2) {
                System.out.println("Số phần tử của mảng không thoả mãn");
                break;
            }
            int tmp;
            tmp = newArr[1];
            newArr[1] = newArr[2];
            newArr[2] = tmp;
            System.out.println("Mảng mới sau khi đổi chỗ phần tử: " + Arrays.toString(newArr));
            break;
        }
        while (true);

        //Sắp xếp mảng tăng dần
        System.out.println("------------------------------");
        for (int i = 0; i < newArr.length; i++) {
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[i] > newArr[j]) {
                    int tmp;
                    tmp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = tmp;
                }
            }
        }
        System.out.println("Mảng mới sau khi sắp xếp tăng dần: " + Arrays.toString(newArr));
    }
}