import domeModel.CD;
import domeModel.DVD;
import domeModel.DoMe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

        CD cdPrueba = new CD("Barbie Copiloto" , 123, false, "En tu tutu puse mi toto", "La Joaqui", 12);
        DVD dvdPrueba = new DVD("John Wick 4", 180, false, "A lot of violence", "Axeldo");
        DoMe newDoMe = new DoMe();
        newDoMe.addElement(cdPrueba);
        newDoMe.addElement(dvdPrueba);
        System.out.println("\n\n*****************************************");
        System.out.println("Welcome to DoMe, the best media library!");
        System.out.println("*****************************************\n\n");
        System.out.println("What do you want to do today?");

        int options;
        do
        {

            System.out.println("1)Display Media.\n2)Add a movie or a music CD.\n3)Search. \n4)Erase.\n5)Lend or return an element.\n6)Exit program.");
            options = scan.nextInt();
            switch (options) {
                case 1:

                    int option2;
                    do {
                        System.out.println("Select an option :\n1)DVDs.\n2)Music CDs.\n3)Everything.\n4)Previous Menu.");
                        option2 = scan.nextInt();
                        switch (option2) {
                            case 1:
                                String DVDlist = new String();
                                DVDlist = newDoMe.displayDVDs(DVDlist);
                                System.out.println(DVDlist);
                                break;
                            case 2:
                                String CDList = new String();
                                CDList = newDoMe.displayCDs(CDList);
                                System.out.println(CDList);
                                break;
                            case 3:
                                String mediaList = new String();
                                mediaList = newDoMe.displayMedia(mediaList);
                                System.out.println(mediaList);
                                break;

                        }
                    } while (option2 != 4);

                case 2:
                    System.out.println("do you want to add a CD or a DVD?");
                    String type = scan.next();
                    scan.nextLine();
                    System.out.println("Please, insert the title : ");
                    String newElementTitle = scan.nextLine();
                    System.out.println("Please, insert element lenght (in minutes) : ");
                    int newElementLength = scan.nextInt();
                    String newElementComment = "";
                    if (type.equals("CD")) {
                        scan.nextLine();
                        System.out.println("Please, now insert author : ");
                        String newElementAuthor = scan.nextLine();
                        System.out.println("Please insert the number of songs :");
                        int newElementNumberOfSongs = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Please, insert a comment :");
                        newElementComment = scan.nextLine();
                        newDoMe.submitNewCDInfo(newElementLength, newElementAuthor, newElementTitle, newElementNumberOfSongs, newElementComment);
                    } else if (type.equals("DVD")) {
                        scan.nextLine();
                        System.out.println("Please, insert Director's name :");
                        String newElementDirector = scan.nextLine();
                        scan.nextLine();
                        System.out.println("Please, insert a comment");
                        newElementComment = scan.nextLine();
                        newDoMe.submitNewDVDInfo(newElementLength, newElementDirector, newElementTitle, newElementComment);
                    }
                    System.out.println("\nElement added successfully!");
                    break;

                case 3:


                default:
                    System.out.println("Wrong. Try Again :)");
                    break;






            }

        }while (options != 6);

    }}