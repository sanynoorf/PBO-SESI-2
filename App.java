public class App {
    public static void main(String[] args) throws Exception{
        Double sisi = 16.0;
        persegi A = new persegi(sisi);
        System.out.println("luas persegi:" + A.getLuas());
        System.out.println("keliling persegi:" + A.getKeliling());

        buku buku1 = new buku("Fahmi", "Internet Of Thing", 15000, 2);
        buku buku2 = new buku("Eti", "Dimanakah Letak Pacarky", 20000, 3);

        double totalPrice = buku1.buybuku(4) + buku2.buybuku(2);
        System.out.println("Total Harga yang harus dibayar Rp." + totalPrice);
    }
}