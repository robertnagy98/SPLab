public class Image implements Element {
    private String imageName;

    Image (String imageName){
        this.imageName=imageName;
    }
    public void print()
    {
        System.out.print("Image : " + this.imageName);
    }
}
