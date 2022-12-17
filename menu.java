public class menu implements Warung {

    private int pesanan;
    private boolean masuk;

    public menu() {
        // set pesanan awal
        this.pesanan = 0;
    }

    @Override
    public void masuk() {
        masuk = true;
        System.out.println("------------------------------------------------");
        System.out.println("    Selamat datang di warung makan seadanya");
        System.out.println("------------------------------------------------");
    }

    @Override
    public void pesan() {
        masuk = false;
        System.out.println("Pesanan akan segera diproses, Mohon untuk ditunggu");
    }

    @Override
    public void tambah() {
        if (masuk) {
            if (this.pesanan == MAX) {
                System.out.println("Pesanan sudah maksimal");
                System.out.println("pesanan anda" + this.getVolume() );
            } else {
                this.pesanan += 1;
                System.out.println("Pesanan sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Masuk ke warungnya dulu dong:)");
        }
    }

    @Override
    public void kuran() {
        if (masuk) {
            if (this.pesanan == MIN) {
                System.out.println("Anda belum memesan apa apa");
            } else {
                this.pesanan -= 1;
                System.out.println("Pesanan sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Masuk ke warungnya dulu dong:)");
        }
    }

    public int getVolume() {
        return this.pesanan;
    }

}