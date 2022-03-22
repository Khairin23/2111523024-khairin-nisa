package Kelompok;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class apotek {
    public static void main(String[] args) {

    String pilihanUser;
    int i;
    int x=0;
    int total;
    int angka;
    int jumlah, cash, kembalian;
    int nama_obat,stock_tersedia;
    int harga_obat=0;
    int stock_obat=0;
    String a;
    String Obatnya;
    boolean bool = true;
    boolean ketemu = false;

    int [] harga = {5000,6000,3000,4000,15000};
    String [] obatt = {"Paracatamol"," Amoxicillin"," Asam mefenamat "," Bodrex "," Siladex "};
    int [] stock = {100,300,75,90,60};

    LinkedList <String> saya = new LinkedList<>();
    Stack<String> obat = new Stack<String>();
    Stack<Integer> stockk = new Stack <Integer>();
    Queue<String> namapelanggan = new LinkedList<>();


    System.out.println(" ======================================");
    System.out.println("            SELAMAT DATANG             ");
    System.out.println(" ===================================== ");
    System.out.println("------------APOTEK BERKAH--------------");
    System.out.println(" ======================================");

    System.out.println("\n==================================");
    System.out.println("             OBAT               ");
    System.out.println("==================================");
    System.out.println(" 1. Pracatamol     ||  Rp5.000 ");
    System.out.println(" 2. Amoxicillin    ||  Rp6.000");
    System.out.println(" 3. Asam mefenamat ||  Rp3.000");
    System.out.println(" 4. bodrex         ||  Rp4.000");
    System.out.println(" 5. Siladex        ||  Rp15.000");
    System.out.println("\n==================================");
    System.out.println();

    Scanner pilih =new Scanner(System.in);
    Scanner Pilih =new Scanner(System.in);
do {
    System.out.println("    1. CEK Stock obat");
    System.out.println("    2. Tambah stock obat");
    System.out.println("    3. Pembelian Obat");
    System.out.println("    4. Cek Antrian Pembelian");
    System.out.println("    5. Cari Data Pembeli");

    System.out.print("MASUKAN PILIHAN [1-5]: ");
    pilihanUser =pilih.next();

    switch (pilihanUser) {
        case "1":
        
        System.out.print("\n > Masukkan jenis Obat : ");
        nama_obat = pilih.nextInt();
        pilih.nextLine();
        

        if (nama_obat == 1) {
            Obatnya = obatt [0];
            stock_obat = stock [0];
            System.out.println("nama obat : "+Obatnya);
            System.out.println("stock obat yang tersedia : "+ stock_obat);
            System.out.println();
        } else if (nama_obat == 2) {
            Obatnya = obatt [1];
            stock_obat = stock [1];
            System.out.println("nama obat : "+Obatnya);
            System.out.println("stock obat yang tersedia : "+ stock_obat);
            System.out.println();
        } else if (nama_obat == 3) {
            Obatnya = obatt [2];
            stock_obat= stock [2];
            System.out.println("nama obat : "+Obatnya);
            System.out.println("stock obat yang tersedia : "+ stock_obat);
            System.out.println();
        }else if (nama_obat == 4) {
            Obatnya = obatt [3];
            stock_obat= stock [3];
            System.out.println("nama obat : "+Obatnya);
            System.out.println("stock obat yang tersedia : "+ stock_obat);
            System.out.println();
       } else if (nama_obat == 5) {
           Obatnya = obatt [4];
           stock_obat = stock [4];
           System.out.println("nama obat : "+Obatnya);
           System.out.println("stock obat yang tersedia : "+ stock_obat);
           System.out.println();
       }else {
            System.out.println("Nomor yang anda masukkan salah");
            System.out.print("\n > Masukkan jenis kelas : ");
            nama_obat = pilih.nextInt();
            pilih.nextLine();
       }
        break;

        case "2":
        System.out.print("\n > Masukkan jenis Obat : ");
        nama_obat = pilih.nextInt();
        pilih.nextLine();

        if (nama_obat == 1) {
            Obatnya = obatt [0];
            System.out.println("nama obat : "+Obatnya);
            System.out.print(" masukkan stock yang di tambahkan : ");
            angka=pilih.nextInt();
            stockk.push(angka);
            stock_obat = stock [0]+angka;
            System.out.println("stock obat yang tersedia : "+ stock_obat);
            System.out.println();
        } else if (nama_obat == 2) {
            Obatnya = obatt [1];
            System.out.println("nama obat : "+Obatnya);
            System.out.print(" masukkan stock yang di tambahkan : ");
            angka=pilih.nextInt();
            stockk.push(angka);
            stock_obat = stock [1]+angka;
            System.out.println("stock obat yang tersedia : "+ stock_obat);
            System.out.println();
        } else if (nama_obat == 3) {
            Obatnya = obatt [2];
            System.out.println("nama obat : "+Obatnya);
            System.out.print(" masukkan stock yang di tambahkan : ");
            angka=pilih.nextInt();
            stockk.push(angka);
            stock_obat = stock [2]+angka;
            System.out.println("stock obat yang tersedia : "+ stock_obat);
            System.out.println();
        }else if (nama_obat == 4) {
            Obatnya = obatt [3];
            System.out.println("nama obat : "+Obatnya);
            System.out.print(" masukkan stock yang di tambahkan : ");
            angka=pilih.nextInt();
            stockk.push(angka);
            stock_obat = stock [3]+angka;
            System.out.println("stock obat yang tersedia : "+ stock_obat);
            System.out.println();
       } else if (nama_obat == 5) {
            Obatnya = obatt [4];
            System.out.println("nama obat : "+Obatnya);
            System.out.print(" masukkan stock yang di tambahkan : ");
            angka=pilih.nextInt();
            stockk.push(angka);
            stock_obat = stock [4]+angka;
            System.out.println("stock obat yang tersedia : "+ stock_obat);
            System.out.println();
       }else {
            System.out.println("Nomor yang anda masukkan salah");
            System.out.print("\n > Masukkan jenis kelas : ");
            nama_obat = pilih.nextInt();
            pilih.nextLine();
       }

      break;

        case "3":
        int n=0;
        n++;
        for (int j=0; j<n; j++)
        {
            System.out.print(" Masukkan Nama pelanggan: ");
            a=pilih.next();
            namapelanggan.add(a);
        }

        System.out.print("\n > Masukkan jenis Obat : ");
        nama_obat = pilih.nextInt();
        pilih.nextLine();
        
        if (nama_obat == 1) {
            harga_obat = harga [0];
        } else if (nama_obat == 2) {
            harga_obat = harga [1];
        } else if (nama_obat == 3) {
            harga_obat= harga [2];
        }else if (nama_obat == 4) {
            harga_obat=harga [3];
       } else if (nama_obat == 5) {
           harga_obat = harga [4];
       }else {
            System.out.println("Nomor yang anda masukkan salah");
            System.out.print("\n > Masukkan jenis kelas : ");
            nama_obat = pilih.nextInt();
            pilih.nextLine();
       }

    System.out.print(" Masukkan jumlah : ");
    jumlah=Pilih.nextInt();

    stock_obat = stock_obat - jumlah;

    total = harga_obat * jumlah ;
    System.out.print(" Total harga : Rp. "+total);
    System.out.println("");

    System.out.print(" Cash : Rp. ");
    cash=Pilih.nextInt();
    kembalian = cash - total;
    System.out.println("Kembalian : Rp. "+kembalian);
    System.out.println("");
    
    break;

    case "4":
    System.out.print(" Cek antrian :  "+namapelanggan.isEmpty());
    System.out.print(" antrian : "+namapelanggan);
    System.out.print("");
    break;

    case "5":
    System.out.print(" Cari Data Pembeli ");
    break;

      default:
        System.err.println("\nInput anda tidak ditemukan\nInputkan [1-5]");
    }
}
while(bool);

}

    }
