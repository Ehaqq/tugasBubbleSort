import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortingNama {
    public static void main(String[] args) throws Exception {
        BufferedReader kata = new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.println("Jumlah Nama Yang Di Inputkan ;");
        a = Integer.parseInt(kata.readLine());

        String[] Array;
        Array = new String[a];
        String temp; 
        // inputan nama
        for (int i = 0; i < a; i++) {
            System.out.print("Nama " + (i + 1) + " adalah: ");
            NodePath input = null;
        }
        // proses sorting
        for (int x = 1; x < a; x++) {
            for (int y = 0; y < a - x; y++) {
                if (Array[y].compareTo(Array[y + 1]) > 0) {
                    temp = Array[y];// contoh :Ahmad,Kurniawan,Ilham,Budi,Adi,Eko,Nurul,Putra,Arif,Ari,Indra,Dyah,Rizki,Maria,Ratih,Pratiwi,Kartika,Wulandari
                    Array[y] = Array[y + 1];//contoh :Ahmad,Kurniawan,Ilham,Budi,Adi,Eko,Nurul,Putra,Arif,Ari,Indra,Dyah,Rizki,Maria,Ratih,Pratiwi,Kartika,Wulandari
                    Array[y + 1] = temp; //contoh :Ahmad,Kurniawan,Ilham,Budi,Adi,Eko,Nurul,Putra,Arif,Ari,Indra,Dyah,Rizki,Maria,Ratih,Pratiwi,Kartika,Wulandari
                }
            }
        }
        // proses pengurutan nama
        System.out.println("");
        System.out.println("Urutannya ");

        for (int i = 0; i < a; i++) {
            System.out.println((i + 1) + ". " + Array[i]);
        }
        // hasil dari jumlah siswa
        System.out.println("Jumlah siswa : " + a);
        System.out.println("nama 2 terbawah : " + Array[a - 2]);
        System.out.println("nama 2 teratas : " + Array[1]);
    }
}

