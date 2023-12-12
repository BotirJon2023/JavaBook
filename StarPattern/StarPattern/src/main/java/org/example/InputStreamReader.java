package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class InputStreamReader extends Reader {
    public InputStreamReader(InputStream in) {
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}
