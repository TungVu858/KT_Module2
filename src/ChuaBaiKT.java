import java.util.Scanner;

public class ChuaBaiKT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Nhập vào số lượng và phần tử của mảng:
        System.out.println("Nhập vào số lượng phần tử : ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        for (int i =0;i<arr.length;i++){
            System.out.println("Nhập vào phần tử thứ : " + i);
            arr[i] = sc.nextInt();
        }
        taoMang(arr);
//        Tính tổng chẵn
        int sum =0;
        for (int j : arr) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        System.out.println("Tổng phần tử chẵn là : " + sum);
//        Tìm vị trí
        System.out.println("Nhập số cần tìm : ");
        int a = sc.nextInt();
        System.out.println("Vị trí trong mảng là : " + tim(arr,a));
//        Xóa
        System.out.println("Nhập số phải xóa : ");
        int b =sc.nextInt();
        int viTri = tim(arr,b);
        int [] newArr = new  int[arr.length-1];
        for (int i =0;i<viTri;i++){
            newArr[i] = arr[i];
        }
        for (int i = viTri;i< arr.length-1;i++){
            newArr[i] = arr[i+1];
        }
        taoMang(newArr);
//        Thêm
        System.out.println("Nhập số phải thêm : ");
        int c = sc.nextInt();
        System.out.println("Nhập vị trí thêm : ");
        int viTriThem = sc.nextInt();
        int [] newArr2 = new int[arr.length+1];
        for (int i =0;i<viTriThem;i++){
            newArr2[i] = arr[i];
        }
        for (int i = viTriThem;i<arr.length+1;i++){
            newArr2[i] = c;
            c = arr[i-1];
        }
        taoMang(newArr2);
    }
    static void taoMang(int[] arr){
        System.out.println("Mảng là : ");
        for (int j : arr) {
            System.out.println(j);
        }
    }
    static int tim(int[]arr,int a){
        int b = -999;
        for (int i =0 ; i<arr.length;i++){
            if (arr[i] == a) {
                b = i;
            }
        }
        return b;
    }
}
