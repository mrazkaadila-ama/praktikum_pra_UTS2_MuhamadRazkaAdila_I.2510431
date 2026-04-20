public class HitungBeraksi {
    public static void main(String[] args) {
        Hitung hitung = new Hitung();
        System.err.println("Pertambahan 2 angaka (int): " + hitung.tambah(5, 3));
        System.err.println("Pertambahan 2 angka (double): " + hitung.tambah(5.5, 3.3));
        System.err.println("Pertambahan 3 angka (int): " + hitung.tambah(1, 2, 3));
    }
}
