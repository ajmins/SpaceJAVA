package udemyPractices;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * The program will have an Album class containing a list of songs. 
 * The albums will be stored in an ArrayList Songs from different albums can be added to the playlist and will appear in the list in the order they are added.
 */
public class Album {

	private String name;
	private String artist;
	private ArrayList<Song>songs;
	
	//constructor
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	
	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}
	private Song findSong(String title) {
		for (Song checkedSong : this.songs) {
			if (checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
		}
		return null;
	}
	
	public boolean addToPlayList(int trackNumber, LinkedList<Song>playList) {
		int index = trackNumber-1;
		if (index>=0 && index <=this.songs.size()) {
			playList.add(this.songs.get(index));
			return true;
		}
		System.out.println("This album does not have a track number "+ trackNumber);
		return false;
	}
	public boolean addToPlayList(String title, LinkedList<Song>playList) {
		Song checkSong = findSong(title);
		if (checkSong != null) {
			playList.add(checkSong);
			return true;
		}
		System.out.println("The song: "+title+" is not in the album!");
		return false;
		
	}
	
}
