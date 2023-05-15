import java.util.List;
import java.util.ArrayList;

class SongV2{
    private String title;
    private String artist;
    private int bpm; //3 instance variables for the 3 song attributes in the file

    SongV2(String title, String artist, int bpm){
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int getBpm(){
        return bpm;
    }

    public String toString(){
        return title;
    }
}

class MockSong{
    public static List<String> getSongStrings(){
         List<String> songStrings = newArrayList<>();
    return songStrings;
    }

    public static List<SongV2> getSongsV2(){
        List <SongV2> songs = new ArrayList<>();

        songs.add(new SongV2 ("somersault", "zero 7", 147));
        songs.add(new SongV2 ("cassidy", "grateful dead", 158));
        songs.add(new SongV2 ("$10", "hitchhiker", 140));

        songs.add(new SongV2 ("havana", "cabello", 105));
        songs.add(new SongV2 ("Cassidy", "grateful dead", 158));
        songs.add(new SongV2 ("50 ways", "simon", 102));
        return songs;
    }
}