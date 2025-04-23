
package View;

import Models.*;

public class ViewConsole {
public void printBookArray(Book[] books){
for (Book p : books ){
System.out.println(p);
}
System.out.println("----");
}



public void printMessage(String message){
System.out.println(message);
}
}