package kr.co.ezenac.ioc;

import java.util.Base64;

public class Encoder {

    private IEncoder iEncoder;
/*

    public Encoder() {
        //this.iEncoder = new Base64Encoder();
        this.iEncoder = new UrlEncoder();       //url 방식을 바꾸라는 요청이 생겨서 변경함
    }
*/

    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }
}
