package ro.fasttrackit;

public class Quote{

    private final Integer id;
    private final String author;
    private final String quote;
    private boolean favourite;

    public Quote(Integer id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }


}
