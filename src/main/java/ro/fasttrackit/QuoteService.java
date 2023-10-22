package ro.fasttrackit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteService {
    private final List<Quote> quoteList;

    public QuoteService() {
        QuoteReader quotes = new QuoteReader();
            this.quoteList = quotes.reader();
    }

    public List<String> getAllQuotes() {
        List<String> allQuotes = new ArrayList<>();
        for (Quote quote : quoteList) {
            allQuotes.add(quote.getQuote() + "\n");
        }
        return allQuotes;
    }

    public List<Quote> getQuotesForAuthor(String author) {
        List<Quote> quotesForAuthor = new ArrayList<>();
        for (Quote quote : quoteList) {
            if(quote.getAuthor().equalsIgnoreCase(author)){
                quotesForAuthor.add(quote);
            }
        }
        return quotesForAuthor;
    }

    public List<String> getAuthors() {  //distinct
        List<String> authors = new ArrayList<>();
        for (Quote quote : quoteList) {
            if(!authors.contains(quote.getAuthor())){
                authors.add(quote.getAuthor());
            }
        }
            return authors;
    }

    public void setFavourite(int id) {
        quoteList.get(id-1).setFavourite(true);
    }

    public List<Quote> getFavourites() {
        List<Quote> favourites = new ArrayList<>();
        for (Quote quote : quoteList) {
            if(quote.isFavourite()){
                favourites.add(quote);
            }
        }
        return favourites;
    }

    public String getRandomQuote() { // java.util.Random for id
        return quoteList.get(new Random().nextInt(quoteList.size())).getQuote();
    }
}
