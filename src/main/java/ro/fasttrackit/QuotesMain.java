package ro.fasttrackit;

import java.io.IOException;

public class QuotesMain {
    public static void main(String[] args) {

//        QuoteReader test
//        QuoteReader readerTest = new QuoteReader();
//        System.out.println(readerTest.reader().toString());

        QuoteService quoteBot = new QuoteService();
//        System.out.println(quoteBot.getAllQuotes());
//        System.out.println(quoteBot.getQuotesForAuthor("unkNown"));
//        System.out.println(quoteBot.getAuthors());

//        quoteBot.setFavourite(3);
//        quoteBot.setFavourite(55);
//        quoteBot.setFavourite(34);
//        quoteBot.setFavourite(654);
//        System.out.println(quoteBot.getFavourites());

        System.out.println(quoteBot.getRandomQuote());
        System.out.println(quoteBot.getRandomQuote());
        System.out.println(quoteBot.getRandomQuote());
        System.out.println(quoteBot.getRandomQuote());
    }
}
