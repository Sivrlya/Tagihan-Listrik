import java.util.Scanner;

public class latihanSoalFungsi {
    static void tampilNama(int id){
        String namaPelanggan[]={"Ali","Budi","Dani","Edi","Umar"};
        System.out.println(namaPelanggan[id-1]);
    }

static void hitungTarif(int jumlahPakai) {
    int harga=0;
        if(jumlahPakai > 0 || jumlahPakai < 10){
            harga=jumlahPakai*2000;
        }
        else if(jumlahPakai >= 11 && jumlahPakai <= 20){
            harga=jumlahPakai*3000;
        } 
        else if(jumlahPakai >= 21 && jumlahPakai <= 30){
            harga=jumlahPakai*4000;
        } 
        else if(jumlahPakai >= 31){
            harga=jumlahPakai*5000;
        } 
        System.out.println(harga+10000);
    }
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan ID: ");
    int angka = input.nextInt();
    tampilNama(angka);

    System.out.println("Jumlah Pakai: ");
    int jumlah = input.nextInt();
    System.out.println("Jumlah Pemakaian: "+jumlah);
    hitungTarif(jumlah);

}
    
}
        



