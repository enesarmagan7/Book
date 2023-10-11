package Book;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


       // Kendi sıralamamızı oluşturmak için Treeset veri tipini kullanıyoruz.
        TreeSet<Book> books1 = new TreeSet<>(new Comparator<Book>() {  //Sıralama için treeset parametre olarak Comparator alıyor.
            @Override
            //Sıralama yapmak için compare metodunu override ediyoruz.
            public int compare(Book o1, Book o2) {
                //   Sayfa numarasına göre karşılaştırma yapıyoruz.
                return o1.getPageNumber()- o2.getPageNumber();
            }

        });
        //
        books1.add(new Book("1984",352,"George Orwell","1949"));
        books1.add(new Book("Kırmızı Pazartesi",500,"Gabriel Garica Marques","1982"));
        books1.add(new Book("Evren Avucunda",700,"Christophe Galfard","2015"));
        books1.add(new Book("Küçük Ağa",460,"Tarık Buğra","1963"));
        books1.add(new Book("Dune Tanrı İmparatoru",350,"Frank Harbert","1981"));
        System.out.println("\n-------------------\n");
        System.out.println("Sayfa Numarasına göre sıralama :\n ");

        for (Book book: books1){
            System.out.println(book.getName());
        }
        System.out.print("\n-------------------\n");
        TreeSet<Book> books2=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                //İsime göre karşılaştırma yapıyoruz.
                return o1.getName().compareTo(o2.getName());
            }
        });

        books2.add(new Book("Dokuzuncu Hariciye Koğuşu",112,"Peyami Safa","1930"));
        books2.add(new Book("Otostopçunun Galaksi Rehberi",868,"Douglas Adams","1979"));
        books2.add(new Book("Algoritmaya Giriş",320,"Fahri Vatansever","2020"));
        books2.add(new Book("Kırık Hayatlar ",344,"Halid Ziya Uşaklıgil","1923"));
        books2.add(new Book("Simyacı",188,"Paulo Coelho","1988"));


        System.out.println("Kitap ismine göre sıralama :\n ");
        for (Book book: books2){
            System.out.println(book.getName());
        }
    }

}
