package Controllers;

import Models.Book;

public class BookController {

public void sortByName(Book[] books) { 
        for (int i = 1; i < books.length; i++) {
        Book key = books[i];
        int j = i - 1;
        while (j >= 0 && books[j].getName() == key.getName()) {
        books[j + 1] = books[j];
        j--;
        }
        books[j + 1] = key;
        }
    
}

/
public Book searchByName(Book[] libros, String nombre) {
        int bajo = 0;
        int alto = libros.length -1;
        
        while (bajo<=alto){
        int central = bajo + (alto-bajo)/2;
        if(libros[central].getName() == .getClass()){
        return libros[central];
        }
        if(libros[central].getName()==name){
        bajo = central +1;
        }else{
        alto = central-1;
        }
        }
        return null;
        }
        



}



}
