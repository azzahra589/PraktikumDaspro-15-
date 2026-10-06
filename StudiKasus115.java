import java.util.Scanner;

public class StudiKasus115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.println("Masukkan jumlah Cup : ");
        jumlahCup = sc.nextInt();
        System.out.println("Masukkan uang Bayar : ");
        uangBayar = sc.nextInt();
        
        //Hitung total harga
        totalHarga = jumlahCup*hargaPerCup;
        diskon = 0;

        //Cek Diskon
        if (totalHarga >= 100000) {
            diskon = totalHarga*10/100;
        }

        //Hitung total bayar
        totalBayar = totalHarga - diskon;

        System.out.println("Total harga     : Rp " + totalHarga);
        System.out.println("Diskon          : Rp " + diskon);
        System.out.println("Total bayar     : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian     : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }
        sc.close();
    }
}