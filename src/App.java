public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        int[] numbersz = {1,2,3,4,5,6,7,8,9,10,100,333,567};
        for (int j : numbersz) {
            System.out.print(j +",");
        }
        System.out.println("");
        //System.out.println("Hello, World!");
    }
}
