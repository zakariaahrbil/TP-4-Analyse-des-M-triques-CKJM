package library.service;

public class LibraryFactory
{
    private static volatile LibraryFactory instance;

    public static LibraryFactory getInstance()
    {
        if (instance == null) {
            synchronized (LibraryFactory.class) {
                if (instance == null) {
                    instance = new LibraryFactory();
                }
            }
        }
        return instance;
    }
    public ILibrary createLibrary()
    {
        return new Library();
    }
}
