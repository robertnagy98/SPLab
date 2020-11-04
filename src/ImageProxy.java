public class ImageProxy implements Element, Picture
{
    String url;
    Dimension dim;
    Image realImg;

    ImageProxy(String name)
    {
        realImg = new Image(name);
    }

    public void print()
    {
        realImg.print();
    }

    public String url()
    {
        return null;
    }

    public Dimension dim()
    {
        return null;
    }

    public PictureContent content()
    {
        return null;
    }

    public Image loadImage()
    {
        if(realImg==null)
            realImg = new Image(url);
        return realImg;
    }
}
