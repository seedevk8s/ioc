package kr.co.ezenac.ioc;

import java.util.Base64;

public class Encoder {

    private IEncoder iEncoder;

    public Encoder() {
        this.iEncoder = new Base64Encoder();
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }
}
