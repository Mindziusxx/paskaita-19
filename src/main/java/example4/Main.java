package example4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//public class Main {
//    public static void main(String[] args) {
//
//        try (
//                FileInputStream fileInputStream = new FileInputStream("index2.txt");
//                BufferedInputStream bufferedInputStrea = new BufferedInputStream(fileInputStream)
//        ) {
//            int i;
//
//            while ((i = bufferedInputStrea.read()) != -1) {
//
//                System.out.print((char) i);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}


public class Main {
    public static void main(String[] args) {

        try (
                FileInputStream fileInputStream = new FileInputStream("index2.txt");
                BufferedInputStream bufferedInputStrea = new BufferedInputStream(fileInputStream)
        ) {
            int i;

            while ((i = bufferedInputStrea.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}