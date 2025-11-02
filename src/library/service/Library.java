package library.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import library.model.*;

public class Library
        implements ILibrary
{
    private List<Lendable> items;

    public Library()
    {
        items = new ArrayList<>();
    }

    public void addItem(Lendable item)
    {
        items.add(item);
    }

    public void removeItem(Lendable item)
    {
        items.remove(item);
    }

    // Méthode volontairement incorrecte pour TP SonarQube
    public List<Lendable> getAvailableItems()
    {
        List<Lendable> available = new ArrayList<>();
        for (Lendable item : items) {
            if (!item.isBorrowed()) {
                available.add(item);
            }
        }
        return available;
    }

    public void listAllItems()
    {
        for (Lendable item : items) {
            if (item instanceof  Book){
                item.displayInfo();
            }
            else {
                System.out.println("Unknown item type");
            }
        }
    }
}
