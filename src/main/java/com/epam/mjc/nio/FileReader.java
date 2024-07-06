package com.epam.mjc.nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.*;

public class FileReader {

    public Profile getDataFromFile(File file) {
        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(file)))
        {
            String name = reader.readLine().replaceAll(".*: ", "");
            String age = reader.readLine().replaceAll(".*: ", "");
            String email = reader.readLine().replaceAll(".*: ", "");
            String phone = reader.readLine().replaceAll(".*: ", "");
            return  new Profile(name,Integer.valueOf(age),email,Long.valueOf(phone));
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return new Profile();
        }
    }
}
