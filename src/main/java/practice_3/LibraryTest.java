package practice_3;

public class LibraryTest {
    Library library = new Library();
    String newCategory = library.category;
    //String bookTitleWithoutGetter = library.bookTitle;it is impossible to access field "bookTitle" without get method
    String bookTitleWithGetter = library.getBookTitle();
    String newAuthor = library.author;
    int newYear = library.year;

}
