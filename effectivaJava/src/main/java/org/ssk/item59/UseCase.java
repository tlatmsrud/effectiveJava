package org.ssk.item59;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * title        :
 * author       : sim
 * date         : 2024-05-23
 * description  :
 */
public class UseCase {

    public static void main(String[] args) throws IOException {
        try(InputStream in = new URL("https://www.naver.com/").openStream()){
            in.transferTo(System.out);
        }
    }
}
