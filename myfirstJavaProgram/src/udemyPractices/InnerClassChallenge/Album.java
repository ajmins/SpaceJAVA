package udemyPractices.InnerClassChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * The program will have an Album class containing a list of songs. 
 * The albums will be stored in an ArrayList Songs from different albums can be added to the playlist and will appear in the list in the order they are added.
 */
public class Album {

	private String name;
	private String artist;
	private SongList songs;
	
	//constructor
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new SongList();
	}
	
	public boolean addSong(String title, double duration) {
		return this.songs.add(new Song(title, duration));

	}
	
	public boolean addToPlayList(int trackNumber, LinkedList<Song>playList) {
		Song checkedSong = this.songs.findSong(trackNumber);
		if (checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("This album does not have a track number "+ trackNumber);
		return false;
	}
	public boolean addToPlayList(String title, LinkedList<Song>playList) {
		Song checkSong = songs.findSong(title);
		if (checkSong != null) {
			playList.add(checkSong);
			return true;
		}
		System.out.println("The song: "+title+" is not in the album!");
		return false;
		

	}
	//create an inner class
	private class SongList{
		private ArrayList<Song>songs;

		//create constuctor
		public SongList() {
			this.songs = new ArrayList<Song>();
		}
		
		public boolean add(Song song) {
			if (songs.contains(song)) {
				return false;
			}
			this.songs.add(song);
			return true;
		}
		private Song findSong(String title) {
			for (Song checkedSong : this.songs) {
				if (checkedSong.getTitle().equals(title)) {
					return checkedSong;
				}
			}
			return null;
		}
		public Song findSong(int trackNumber) {
			int index = trackNumber -1;
			if ((index >0)&& (index<songs.size())) {
				return songs.get(index);
			}
			return null;
		}
	}
}
