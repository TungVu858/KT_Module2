import java.util.Scanner;

public class KT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử của mảng : ");
            int num = sc.nextInt();
            arr[i] = num;
        }
//     Tính tổng phần tử trong mảng
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Tổng : " + sum);
//     Nhập vào a tìm vị trí a trong mảng :
        System.out.println("Nhập a : ");
        int a = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                check = true;
                arr[i] = arr[i + 1];
                System.out.println(a + " có trong mảng, vị trí là : " + i);
            }
        }
        if (!check) {
            System.out.println(a + " không có trong mảng ");
        }
//     Nhập a ,xóa a khỏi mảng:
        int[] newarr = new int[n - 1];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = arr[i];
            System.out.println(newarr[i]);
        }
//     Nhập c , thêm c vào mảng:
        System.out.println("Nhập c :");
        int c = sc.nextInt();
        System.out.println("Nhập vị trí thêm c vào mảng : ");
        int d = sc.nextInt();
        int[] newarr1 = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                arr[i] = arr[i - 1];
            }
        }
        for (int i = 0; i < newarr1.length; i++) {
            newarr1[i] = arr[i];
            System.out.println(newarr1[i]);
        }
    }
}
