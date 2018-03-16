//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("index.txt");
//            fileOutputStream.write("Labas".getBytes());               ///taip į failą įkelia žodį LABAS. Stream baitukais viską daro, todėl reikia to get.byte.
//            fileOutputStream.close();
//        } catch (FileNotFoundException e) {         /// Exepcion e - galima tik taip, po juo palįstų abu mano exeption.
//            System.out.println("File not found");
//        } catch (IOException e) {
//        }
//    }
//}


package example2;
import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (
                FileOutputStream fileOutputStream = new FileOutputStream("index.txt")   /// Čia kai nereikia stream close, tada taip rašom.
                ){

            fileOutputStream.write("Labas".getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
        }
    }
}