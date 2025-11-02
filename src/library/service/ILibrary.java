package library.service;

import library.model.Lendable;

import java.util.List;

public interface ILibrary
{
    void addItem(Lendable item);
    void removeItem(Lendable item);
    void listAllItems();

    List<Lendable> getAvailableItems();

}
