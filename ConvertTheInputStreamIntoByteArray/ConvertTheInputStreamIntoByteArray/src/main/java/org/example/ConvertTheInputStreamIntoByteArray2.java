package org.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;

public class ConvertTheInputStreamIntoByteArray2 {

    public static void main(String args[]) {

        try {

            byte[] input = {1, 2, 3, 4};
            InputStream stream = new ByteArrayInputStream(input);
            System.out.println("Input Stream: " + stream);

            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] array = new byte[4];
            int i;

            while ((i = stream.read(array, 0, array.length)) != -1) {

                output.write(array, 0, i);
            }

            byte[] data = output.toByteArray();

            System.out.println("Byte Array: " + Arrays.toString(data));
            stream.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
