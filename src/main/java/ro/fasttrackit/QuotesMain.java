package ro.fasttrackit;

import java.io.IOException;

public class QuotesMain {
    public static void main(String[] args) {

        QuoteReader readerTest = new QuoteReader();
        try {
            System.out.println(readerTest.reader());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}