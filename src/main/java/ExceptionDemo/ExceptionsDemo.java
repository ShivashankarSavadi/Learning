package ExceptionDemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\nInside main ...");
        try {
        share();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally {
            System.out.println("main: Finally");
        }
        System.out.println("\nEnd of main ...");
    }

    private static void share() throws FileNotFoundException {
        System.out.println("\nInside share ...");

        try {
            HttpConnect.send(1, "hello", "http://www.goodsnips.com");
            System.out.println("After invoking send");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
           throw  e;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Test");
        } finally {
            System.out.println("share: Finally");
        }

        System.out.println("\nEnd of share ...");
    }

}
