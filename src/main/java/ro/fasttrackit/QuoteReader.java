package ro.fasttrackit;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuoteReader {
    public List<Quote> reader() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(Path.of("files/quotes.txt"));
        } catch (IOException e) {
            throw new ReaderException("Error reading file: " + e);
        }
        List<Quote> quotes = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tokens = line.split("[~]");
            quotes.add(new Quote(quotes.size() + 1, tokens[0], tokens[1]));
        }

        return quotes;
    }
}
