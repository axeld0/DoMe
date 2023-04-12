package domeModel;

import javax.swing.text.html.CSS;
import java.util.ArrayList;

public class DoMe {

    ArrayList<Element> elementList;

    public DoMe() {
        elementList = new ArrayList<>();
    }

    /**
     *displays a list with all the media loaded in the system.
     */
    public String displayMedia(String MediaList) {
        for (Element e : elementList) {
             MediaList += e.getInfo();
        }
        return MediaList.toString();
    }

    /**
     * only shows a list of movies.
     */
    public String displayDVDs (String DVDList){
        for (Element e : elementList)
            if(e instanceof DVD)
                DVDList += e.getInfo();

        return DVDList.toString();
    }


    /**
     * only shows a list of music cds.
     */
    public String displayCDs(String CDList) {
        for (Element e : elementList){
            if(e instanceof CD)
            {
                CDList += e.getInfo();
            }
        }
        return CDList.toString();
    }

    /**
     * adds an element to the resizable array.
     */
    public void addElement(Element e){

        elementList.add(e);
    }

    /**
   Creates a new CD object and adds it to the arraylist.
     */
    public void submitNewCDInfo ( int length, String author, String title, int numberOfSongs, String comment)
    {
        CD newCD = new CD();
        newCD.setTitle(title);
        newCD.setDoIGotit(false);
        newCD.setNumberOfSongs(numberOfSongs);
        newCD.setAuthor(author);
        newCD.setLength(length);
        newCD.setComment(comment);

        addElement(newCD);

    }


    /**
     Creates a new DVD objecto an adds it to the arrayList.
     */
    public void submitNewDVDInfo (int length, String director, String title, String comment)
    {
        DVD newDVD = new DVD();
        newDVD.setTitle(title);
        newDVD.setDirector(director);
        newDVD.setLength(length);
        newDVD.setComment(comment);
        newDVD.setDoIGotit(false);

        addElement(newDVD);
    }

    /**
     * Searches and looks for an CD or DVD and returns it.
     */

    public String search (String search)
    {
        String found = "Not found, try again.";
        for( Element e : elementList)
        {
            if(search.equals(e.getTitle()))
            {
                found = e.getInfo().toString();
            }
        }
        return found;
    }


    /**
     * erases an element of the ArrayList
     */
    public int delete (String toBeErased)
    {
        int flag = 0;
        for ( Element e : elementList)
        {
            if(toBeErased.equals(e.getTitle()))
            {
                elementList.remove(e);
                flag = 1;
            }
        }
        return flag;
    }

    /**
     * Selects an element to be lended
     */

    public boolean lend (String toBeLended)
    {
        boolean flag = false;
        for (Element e : elementList)
        {

            if(toBeLended.equals(e.getTitle()))
            {
                if(e.isDoIGotit()==false)
                {
                    e.setDoIGotit(true);
                    flag = true;

                }
                else {
                    e.setDoIGotit(false);
                    flag = false;
                }
            }
        }
        return flag;
    }


}
