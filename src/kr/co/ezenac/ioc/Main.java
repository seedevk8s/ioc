package kr.co.ezenac.ioc;

public class Main {

    public static void main(String[] args) {
        String url = "www.google.com/books/it?page=10&size=20&name=springframework";

        // Base 64 encoding
        Encoder encoder = new Encoder();
        String result = encoder.encode(url);


        System.out.println(result);
    }
}