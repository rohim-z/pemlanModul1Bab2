import java.util.Scanner;
public class MainStudent {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa : ");
        int jumlah = in.nextInt();
        in.nextLine();
        System.out.println("");

        //membuat objek dengan array
        Student siswa[] = new Student[jumlah];

        for(int i = 0; i < jumlah; i++){
    
            System.out.println("Data siswa ke-" + (i+1));

            System.out.print("Nama : ");
            String nama = in.nextLine();

            System.out.print("Alamat : ");
            String alamat = in.nextLine();

            System.out.print("Umur : ");
            int umur = in.nextInt();

            System.out.print("Nilai math : ");
            int math = in.nextInt();

            System.out.print("Nilai english : ");
            int english = in.nextInt();

            System.out.print("Nilai Science : ");
            int science = in.nextInt();
            in.nextLine();
            
            siswa[i] = new Student(nama, alamat, umur);
            siswa[i].setMath(math);
            siswa[i].setEnglish(english);
            siswa[i].setScience(science);

            System.out.println("");
        }

        System.out.println("======= Data Siswa =======");
        System.out.println("");

        for(int i = 0; i < jumlah; i++){
            System.out.println("Data siswa ke-" + (i+1));
            siswa[i].displayMessage();
        }

        Student.displayObjek();
        in.close();

    } 
}

