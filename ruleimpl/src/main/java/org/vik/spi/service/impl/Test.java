package org.vik.spi.service.impl;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws Exception{

        Test t =new Test();
        System.out.println(t.readAll());

    }
    String readAll() throws Exception
    {

        InputStreamReader isr = new InputStreamReader(this.getClass().getResourceAsStream("/test"));
        Scanner sc = new Scanner(isr);
        StringBuilder sb = new StringBuilder("");
        while(sc.hasNext())
        {
            sb.append(sc.nextLine()).append("\n");

        }

        return sb.toString();
    }

}
