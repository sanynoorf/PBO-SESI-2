public class buku {
    String author;
    String title;
    int price;
    int publisher_number;
    int totalPrice;
    int numbersOfBooksBuy;

    public buku(String author,String title, int price, int publisher_number) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher_number = publisher_number;
    }
    
    public double buybuku(int numbersOfBooksBuy) {
        this.totalPrice = numbersOfBooksBuy * price;
        System.out.println("Membeli buku" + title + "Sebanyak" + numbersOfBooksBuy);
        return totalPrice;
    }
}