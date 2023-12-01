package model;

import java.io.Serializable;

public class TimeTravelingCharacterQuotes implements Serializable {

    private String name;
    private String date;
    private String quote;

    public TimeTravelingCharacterQuotes(String name, String date, String quote) {
        this.name = name;
        this.date = date;
        this.quote = quote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
