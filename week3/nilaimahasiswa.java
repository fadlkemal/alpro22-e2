import java.util.Scanner;
public class nilaimahasiswa {
    public static void main(String args[]) {
      String x;
      int y;
      Scanner scan = new Scanner(System.in);
      System.out.print("Masukkan nama mahasiswa: ");
      x = scan.nextLine();
      System.out.print("Masukkan nilai mahasiswa: ");
      y = scan.nextInt();
      
      if (y>=75) {
          System.out.println(x+" ,Selamat anda lulus");
          
      }
      else {
          System.out.println(x+" ,Coba lagi");
      }
    }
}