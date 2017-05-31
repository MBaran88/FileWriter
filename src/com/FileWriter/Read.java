package com.FileWriter;

import java.io.*;

/**
 * Created by RENT on 2017-05-31.
 */
public class Read {
    FileInputStream fis = null;
    {
        try {
            fis = new FileInputStream("xxx.txt");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        System.out.println(line);
        try {
            br.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
