
import java.util.Scanner;

/**
 * pemilihan2percobaan212
 */
public class prtnyn2percobaan2212 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        int pilihan_menu;
        String member, JenisPembayaran;
        double diskon, harga, total_bayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket BUndling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input12.nextInt();
        input12.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input12.nextLine();
        System.out.print("Jenis Pembayaran (QRIS/Non-Qris) = ");
        JenisPembayaran = input12.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("bBesar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            
        if (JenisPembayaran.equalsIgnoreCase("Qris")) {
            total_bayar -= 1000;
            System.out.println("Total bayar setelah diskon = " + total_bayar);
            System.out.println("Total bayar = " + total_bayar);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            if (JenisPembayaran.equalsIgnoreCase("Qris")) {
                harga -= 1000;
                System.err.println("Pootongan harga Qris = " + harga);
                System.out.println("Total bayar = " + harga);
            } else if (JenisPembayaran.equalsIgnoreCase("Non-Qris")) {
                System.out.println("Total bayar = " + harga);
            } else {
                System.out.println("jenis pe,bayaran tidak valid");
            }
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("--------------------------------------");

    }
}