import java.util.Scanner;
public class QueueMain {
    public static void menu(){
        System.out.println("Masukan operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("===============================");

    }
    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        System.out.print("Masukan kapasitas queue: ");
        int n = sc16.nextInt();
        Queue Q = new Queue(n);
        int pilih;

        do{
            menu();
            pilih = sc16.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukan data baru: ");
                    int dataMasuk = sc16.nextInt();
                    Q.Enqueue(dataMasuk);
                    if(Q.IsFull()){
                        System.out.println("DATA SUDAH PENUH");
                        pilih = 9;
                    }
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar !=0){
                        System.out.println("Data yang dikeeluaarkan: "+ dataKeluar);
                        break;
                    }else{
                        pilih = 9;
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        }while (pilih == 1||pilih == 2||pilih == 3||pilih == 4||pilih == 5);
    sc16.close();
    }
}
