package com.FileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedWriter fw = null;
        try {
            fw = new BufferedWriter(new FileWriter ("abc.txt"));
            fw.append('x');
            fw.flush();
            fw.close();
        }
        catch (IOException e){};
    }

}
