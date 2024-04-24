package Praktikum2;
import java.util.Scanner;
public class QueueMainNas{
    public static void menu(){
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antiran Baru ");
        System.out.println("2. Antrian Keluar ");
        System.out.println("3. Cek Antrian Terdepan ");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Semua Antrian");
        System.out.println("========================");
    }
    public static void main(String[] args) {
        Scanner sc16= new Scanner(System.in);
        int max;
        System.out.print("Masukan Kapasitas Queue: ");
        int jumlah = sc16.nextInt();
        QueueNas antri = new QueueNas(jumlah);
        int pilih;
        do{
            menu();
            pilih = sc16.nextInt();
            sc16.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc16.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc16.nextLine(); 
                    System.out.print("Alamat: ");
                    String alamat = sc16.nextLine(); 
                    System.out.print("Umur: ");
                    int umur = sc16.nextInt(); 
                    System.out.print("Saldo: ");
                    double saldo = sc16.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.Dequeue();
                    if(!"".equals(data.norek) && !"".equals(data.nama) 
                    && !"".equals(data.alamat) && data.umur !=0 
                    && data.saldo !=0){
                        System.out.println("Antrian yang keluar: "+ data.norek+" "
                        + data.nama+" "
                        + data.alamat+" "+data.umur+" "+data.saldo+"");
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                    case 5:
                    antri.peekRear();
                    break;
            }
        }while (pilih == 1||pilih == 2||pilih == 3||pilih == 4);
    sc16.close();
    }
}


    

