package ro.fasttrackit;

public class Quote {

    private final Integer id;
    private final String author;
    private final String quote;
    private boolean favourite;

    public Quote(Integer id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public Integer getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public boolean isFavourite() {
        return favourite;
    }

    @Override
    public String toString() {
        return "\nID = " + id +
                ", Author = " + author +
                ", Quote = " + quote +
                ", Favourite = " + favourite;
    }
}
