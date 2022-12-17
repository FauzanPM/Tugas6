import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // membuat objek
        Warung warmindo = new menu();
        WarungMakan menu = new WarungMakan(warmindo);

        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("");
            System.out.println("=== WARMINDO SEADANYA ===");
            System.out.println("[1] Masuk warung");
            System.out.println("[2] Tambah menu");
            System.out.println("[3] Kurangi menu");
            System.out.println("[4] kirim & pesan");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                menu.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                menu.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("3")){
                menu.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("4")){
                menu.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Trimakasih sudah berkunjug:)");
            }
        }

    }

}