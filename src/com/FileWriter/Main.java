package com.FileWriter;

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
        //Trzeba zrobić dwie klasy: jedna która odczytuje inty z tabeli a druga która je czyta
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("xxx.txt");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos,"UTF-8"));
            bw.write("xxxąęść");
            bw.close();

            fis = new FileInputStream("xxx.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis,"UTF-8"));
            String line = br.readLine();
            System.out.println(line);
            br.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}






