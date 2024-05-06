package org.ssk.item57;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * title        :
 * author       : sim
 * date         : 2024-05-07
 * description  :
 */
public class UseCase1 {

    public void myMethod(){
        File file = new File("");

        FileInputStream inputStream = null;

        try{
            inputStream = new FileInputStream(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try{
                inputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
