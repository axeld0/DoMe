package domeModel;

public class Element {

    private String title;
    private int length;
    private boolean doIGotit;
    private String comment;


    public Element() {
        title = "";
        length = 0;
        doIGotit = false;
        comment = "";
    }

    public Element(String title, int length, boolean doIGotit, String comment) {
        this.title = title;
        this.length = length;
        this.doIGotit = doIGotit;
        this.comment = comment;
    }

    //setters


    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int lenght) {
        this.length = length;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDoIGotit(boolean doIGotit) {
        this.doIGotit = doIGotit;
    }

    //getters

    public boolean isDoIGotit() {
        return doIGotit;
    }

    public int getLength() {
        return length;
    }
    public String getComment() {
        return comment;
    }

    public String getTitle() {
        return title;
    }


    /**
     * returns all the info of the element
     * **/
    public String getInfo()
    {
        return "\nTitle : "+title + "\nLength (in minutes) : "+length+ "\nDo I got it? :"+doIGotit+"\nComment : "+comment+"\n***\n";
    }

}
