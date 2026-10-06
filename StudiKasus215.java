import java.util.Scanner;

public class StudiKasus115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, janisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPKM;
        
        System.out.println("Nama mahasiswa :  ");
        String nama = sc.nextLine();
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINYA) : ");
        String jenisKegiatan = sc.nextLine();

        If (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.println("jumlahDokumen : ");
            jumlahDokumen = sc.nextInt();

            System.out.println("Peringkat juara : ");
            peringkatJuara = sc.nextInt();
            
            if (jumlahDokumen == 4) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println(" Status : Memenuhi syarat. Dana pemghargaan diberikan.");
                } else {
                    System.out.println("Status : Juara Harapan atau peserta tidak memperoleh dana penghargaan.");
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }
     } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

        System.out.println("jumlah dokumen : ");
        jumlahDokumen = sc.nextInt();

        System.out.print("Status pendanaan (1 = lolos, 0 = tidak lolos) : ");
            statusPKM = sc.nextInt();

            if (jumlahDokumen == 4) {
                // Cek Tingkat 3: Status Lolos Pendanaan
                if (statusPKM == 1) {
                    System.out.println("Status : Memenuhi syarat. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Tim tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }

        } else {
            System.out.println("Status : Kegiatan di luar ketentuan. Dana penghargaan tidak diberikan.");
        }

        sc.close();
    }
}