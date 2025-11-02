package library.model;

import library.functions.ComplexeWorkBook;

public abstract class Lendable
        implements ComplexeWorkBook
{
    private boolean borrowed;
    private String title;
    private String author;

    public Lendable(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public void lendingBorrow()
    {
        if (!borrowed) {
            borrowed = true;
        }
        else {
            System.out.println("This item is already borrowed.");
        }
    }

    public void returnItem()
    {
        if (borrowed) {
            borrowed = false;
        }
        else {
            System.out.println("This item was not borrowed.");
        }
    }

    public boolean isBorrowed()
    {
        return borrowed;
    }

    public void displayInfo()
    {
        System.out.println("Title: " + title + ", Author: " + author + ", Borrowed: " + borrowed);
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }
}