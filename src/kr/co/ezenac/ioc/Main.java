package kr.co.ezenac.ioc;

public class Main {

    public static void main(String[] args) {
        String url = "www.google.com/books/it?page=10&size=20&name=springframework";
/*

        // Base 64 encoding
        IEncoder encoder = new Base64Encoder();
        String result = encoder.encode(url);
        System.out.println(result);

        // url encoding
        IEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);
        System.out.println(urlResult);

*/
        //Encoder encoder = new Encoder(new Base64Encoder());
        Encoder encoder = new Encoder(new UrlEncoder());
        String result = encoder.encode(url);

        System.out.println(result);
    }
}
