package com.FileWriter;

import java.io.*;

/**
 * Created by RENT on 2017-05-31.
 */
public  class Write {
    FileOutputStream fos = null;


    {
        try {
            fos = new FileOutputStream("xxx.txt");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        try {
            bw.write("xxxąęść");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            bw.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}
