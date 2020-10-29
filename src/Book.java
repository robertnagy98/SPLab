import java.util.ArrayList;
import java.util.List;

public class Book {

    public Book(){}
    public String title;
    private ArrayList<Autor> authors= new ArrayList<>();
    private ArrayList<Element> content= new ArrayList<>();

    public Book (String title){
        this.title= title;
    }

    public void addContent(Element element)
    {
        content.add(element);
    }

    public void addAutor(Autor autor)
    {
       authors.add(autor);
    }

    public void print()
    {
        System.out.print("Book :" + this.title);
        printAuthors();
        for(Element i :content)
        {
            i.print();
        }
    }

    private void printAuthors(){
        for (Autor i : authors)
        {
            i.print();
        }
    }
}
