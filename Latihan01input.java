import java.util.Scanner;

public class Latihan01input {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, nim, ps;

        System.out.println("=========Input==========");
        System.out.print("nama: ");
        nama = in.nextLine();
        System.out.print("NIM: ");
        nim = in.nextLine();
        System.out.print("Program Studi: ");
        ps = in.nextLine();
        System.out.println();
        System.out.println("===========Output==========");
        System.out.print("HI" + nama + " Anda Terdaftar dengan NIM:" + nim + "di Program Studi " + ps);

        

            
            


    }
  }

