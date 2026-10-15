package modulo5;

import java.io.FileOutputStream;

import javax.management.RuntimeErrorException;

public class Main {
    public static void main(String[] args) {
        // EXCEPTIONS
        test();
    }


    public static void test(){
        new Throwable();

        new Exception(); new OutOfMemoryError();
        new RuntimeException();
    }
}
