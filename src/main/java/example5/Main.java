package example5;

        import java.io.BufferedWriter;
        import java.io.FileWriter;
        import java.io.IOException;

//public class Main {
//
//    public static void main(String[] args) {
//        try {
//            FileWriter fileWriter = new FileWriter("index3.txt");
//            fileWriter.write("Sveiki gyvi");
//            fileWriter.close();                     ///Close reikia tada, kai FileWrite nera6ome skliaustuose kaip anuose pvz. po try.
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}


public class Main {

    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("index4.txt")) ///Kai taip parašom, tada nereikia  bufferedWriter.close();
        ) {
            bufferedWriter.write("Mindaugas, 180");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
