package academy.learnprograming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs  = new ArrayList<Song>();
    }

    public boolean addSong(String title,double duration)
    {
        int position = songs.indexOf(findSong(title));
        if(position < 0)
        {
            songs.add(new Song(title,duration));
            return true;
        }
        else
            return false;
    }

    private   Song findSong(String title)
    {
        for(int i=0;i<songs.size();i++)
        {
            if(songs.get(i).getTitle().equals(title)) {
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> thePlaylist)
    {
        if(trackNumber-1<songs.size() && trackNumber-1 >= 0)
        {
            int position = thePlaylist.indexOf(songs.get(trackNumber-1));
            if(position >= 0)
                return true;
            else
                return thePlaylist.add(songs.get(trackNumber-1));
        }
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> thePlaylist)
    {
        int position = thePlaylist.indexOf(findSong(title));
        int doesSongExists = songs.indexOf(findSong(title));
        if(position >= 0)
        {
            return true;
        }
        else if(doesSongExists >= 0) {
            thePlaylist.add(findSong(title));
            return true;
        }
        else
            return false;
    }

}
