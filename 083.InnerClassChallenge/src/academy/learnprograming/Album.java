package academy.learnprograming;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        return false;
    }

    public static class SongList
    {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }


        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
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

        private  Song findSong(int trackNumber)
        {
            if(trackNumber>0 && trackNumber<songs.size())
                return songs.get(trackNumber);
            else
                return null;
        }

    }


}
