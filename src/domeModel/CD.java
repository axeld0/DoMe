package domeModel;

public class CD extends Element
{
    private String author;
    private int numberOfSongs;


    public CD() {
        author = "";
        numberOfSongs = 0;
    }

    public CD(String title, int length, boolean doIGotit, String comment, String author, int numberOfSongs) {
        super(title, length, doIGotit, comment);
        this.author = author;
        this.numberOfSongs = numberOfSongs;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    //setters

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }


    @Override
    public String getInfo()
    {
        return "\n<<Music CD>>\n***\nAuthor : "+author+ super.getInfo();
    }


}
