public class WarungMakan {

    private Warung menu;

    public WarungMakan(Warung phone) {
        this.menu = phone;
    }

    void turnOnThePhone(){
        this.menu.masuk();
    }

    void turnOffThePhone(){
        this.menu.pesan();
    }

    void makePhoneLouder(){
        this.menu.tambah();
    }

    void makePhoneSilent(){
        this.menu.kuran();
    }
}