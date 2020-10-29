public class Paragraph implements  Element{

    private String text;

    Paragraph (String text){
        this.text=text;
    }
    public void print()
    {
        System.out.print("Paragraph: " + this.text);
    }
}
