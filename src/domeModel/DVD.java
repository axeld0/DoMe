package domeModel;

public class DVD extends Element
{
    private String director;



    //constructor

    public DVD(){
        director = "";
    }
    public DVD(String title, int lenght , boolean doIGotIt, String comment, String director)
    {
        super (title, lenght, doIGotIt, comment);
        this.director = director;
    }

    //getter

    public String getDirector (){
        return director;
        }
    //setter

    public void setDirector (String director){ this.director = director; }


    @Override
    public String getInfo()
    {
        return "\n<<Movie DVD>>\n Director : "+director + super.getInfo();
    }

}

