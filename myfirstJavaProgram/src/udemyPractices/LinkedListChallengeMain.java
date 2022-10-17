package udemyPractices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


/*
 * Create a program that implements a playlist for songs 
 * Create a Song class having Title and Duration for a song. 
 * The program will have an Album class containing a list of songs. 
 * The albums will be stored in an ArrayList Songs from different albums can be added to the playlist and will appear in the list in the order they are added.
 *  Once the songs have been added to the playlist, 
 *  create a menu of options to:Quit,Skip forward to the next song, skip backwards to a previous song. 
 *  Replay the current song. 
 *  List the songs in the playlist 
 *  A song must exist in an album before it can be added to the playlist (so you can only play songs that you own). 
 *  Hint: To replay a song, consider what happened when we went back and forth from a city before we started tracking the direction we were going. 
 *  As an optional extra, provide an option to remove the current song from the playlist (hint: listiterator.remove()


 */
public class LinkedListChallengeMain {

	private static ArrayList<Album> albums = new ArrayList<Album>();
	public static void main(String[] args) {
		
		Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I give you roses", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList= new LinkedList<Song>();
        //0 - > first album, 1-> second album
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList); //Soldier of fortune
        albums.get(1).addToPlayList(8, playList); //Breaking the rules
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

         play(playList);
	}
	private static void play(LinkedList<Song> playList) {
		
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		
		//ListIterator cannot be initialised, it can be assigned
		ListIterator<Song> listIterator = playList.listIterator();
		if (playList.size()==0) {
			System.out.println("No songs in the playlist");
		}
		else {
//			System.out.println("PlayList: "+ playList+ "has "+playList.size()+" songs");
//			System.out.println("Now playing: "+listIterator.next().toString());
//			System.out.println("Now playing: "+listIterator.next().toString());
//			System.out.println("Now playing: "+listIterator.next().toString());
//			System.out.println("Now playing: "+listIterator.next().toString());
			System.out.println("Now playing: "+listIterator.next().toString());
			printMenu();

		}
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch (action) {
			case 0:
				System.out.println("Playlist Complete");
				quit = true;
				break;
			case 1:
				if (!forward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("Now playing: "+listIterator.next().toString());
				}
				else {
					System.out.println("We have reached the end of the playlist");
					forward = false;
				}
				break;
			case 2:
				if (!forward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println("Now playing: "+listIterator.previous().toString());
				}
				else {
					System.out.println("We are at the beginning of the playlist");
					forward = true;
				}
				break;
			case 3:
				if (forward) {
					if (listIterator.hasPrevious()) {
						System.out.println("Now Replaying: "+listIterator.previous().toString());
						forward = false;
					}
					else {
						System.out.println("We are at the beginning of the playlist");
					}
				}
				else {
					if (listIterator.hasNext()) {
						System.out.println("Now Replaying: "+listIterator.previous().toString());
						forward = true;
						}
					else {
						System.out.println("We have reached the end of the playlist");

						}
					}

				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if (playList.size()>0) {
					listIterator.remove();
					if (listIterator.hasNext()) {
						System.out.println("Now playing: "+listIterator.next());
					}
					else if (listIterator.hasPrevious()) {
						System.out.println("Now playing: "+listIterator.previous());

					}
				}
				break;
			}
		}
		
	}
	private static void printList(LinkedList<Song> playList) {
		int i = 0;
		Iterator<Song> iterator = playList.iterator();
		System.out.println("PlayList Name: #"+i);
		System.out.println("======================");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=======================");
		
	}
	private static void printMenu() {
		System.out.println("Press:\n");
		System.out.println("0- Quit\n"
				+ "1-Play Next\n"
				+ "2-Play Previous\n"
				+ "3-Replay Current\n"
				+ "4-List Songs in the playlist\n"
				+ "5-Print the actions\n"
				+ "6-Delete a song");
	}

}
