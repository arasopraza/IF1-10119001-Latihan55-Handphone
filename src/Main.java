/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program menampilkan teks merk handphone
 * ke layar berbasis OOP dan implementasi pewarisan.
 */

public class Main {
    public static void main(String[] args) {
        Android android = new Android("Samsung", "Android",
                "Grand", 3000000);
        android.setKeyStore("234ibfd3840fo");

        BlackBerry bb = new BlackBerry("BlackB", "RIM",
                "Curve", 2000000);
        bb.setPinBB("BHS249");

        WindowsPhone windows = new WindowsPhone("Nokia", "Win8",
                "Lumia", 1000000);
        windows.setWpKeyStore("UUUQIJWORJ");

        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStore());
        System.out.print("\n");

        bb.displayProduct();
        System.out.println("PIN : " + bb.getPinBB());
        System.out.print("\n");

        windows.displayProduct();
        System.out.println("Wp Key Store : " + windows.getWpKeyStore());
        System.out.print("\n");
    }
}