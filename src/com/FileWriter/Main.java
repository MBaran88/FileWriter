package com.FileWriter;

import javafx.scene.control.Tab;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        /*BufferedWriter fw = null;
        try {
            fw = new BufferedWriter(new FileWriter ("abc.txt"));
            fw.append('x');
            fw.flush();
            fw.close();
        }
        catch (IOException e){};
    }*/
        //Trzeba zrobić dwie klasy: jedna która wpisuje inty z tabeli a druga która je czyta
        {
            FileOutputStream fos = null;


            {
                try {
                    fos = new FileOutputStream("tabela.txt");
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
                BufferedWriter bw = null;
                try {
                    bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
                } catch (UnsupportedEncodingException e1) {
                    e1.printStackTrace();
                }
                int x [][] = {
                        {0,2,3},
                        {4,5,6},
                };
                try {
                    bw.write(x.);
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


    }
}
