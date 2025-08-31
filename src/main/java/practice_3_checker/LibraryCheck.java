package practice_3_checker;

import practice_3.Library;

public class LibraryCheck {
    Library library = new Library();
    //String author = library.author; it is impossible to access field "author" in a different package without get method
    //int year = library.year; it is impossible to access field "year" in a different package without get method
    String category = library.category;
}
