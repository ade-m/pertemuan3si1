import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            break;
        }
        int[] numbersz = {1111,2,3,4233,5,6,7,8,9,10,100,333,567};
        Arrays.sort(numbersz);
        for (int j : numbersz) {
            System.out.print(j +",");
        }
        System.out.println("");
      
        String[] mahasiswas = {"Vinson","Gilbert", "Jian","Kelvin","Kimberly"};
        //sort pengurutan
        Arrays.sort(mahasiswas);
        for (String mahasiswa : mahasiswas) {
            System.out.print(mahasiswa + " ");
        }
        System.out.println("");

        System.out.println("Ini hasil while");
        int x=50;
        //1 billy 
        while(x>50){ //x<10
            System.out.print(x +" ");
            //cetak hanya bilangan genap

            //2 sam
            x=x-10; //x-- x-=1; x=x-1;
        }
        System.out.println("x : " + x);

        System.out.println("Ini hasil do while");
        int y =50;
        do{
            System.out.print(y + " ");
            y-=10;
        }while(y>50);

        System.out.println("y : " + y);
        //System.out.println("Hello, World!");
    }
}
