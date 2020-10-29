import java.util.ArrayList;

public class Section implements Element {
    public String title;
    ArrayList<Element> content = new ArrayList<>();

public Section (String title){
    this.title=title;

}



    public int add(Element element) {
        content.add(element);
        return content.indexOf(element);
    }

    public void remove(Element element) {
        content.remove(element);
    }

    public Element getElement(int index) {
        return content.get(index);
    }

    public void print() {
        System.out.println(title);

        for(Element i : content) {
            i.print();
        }
    }
}