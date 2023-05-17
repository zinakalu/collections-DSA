import java.util.List;
import java.util.ArrayList;

class SongV2 implements Comparable<SongV2>{
    private String title;
    private String artist;
    private int bpm; //3 instance variables for the 3 song attributes in the file

    SongV2(String title, String artist, int bpm){
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public int compareTo(SongV2 other){
        return this.title.compareTo(other.title);
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
        List<String> songStrings = new ArrayList<>();
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

    public static void main(String[] args){
        //Test getSongStrings()
        List<String> songStrings = MockSong.getSongString();
        System.out.println("Song Strings: " + songStrings);

        //Test getSongsV2()
        List<SongV2> songs = MockSong.getSongsV2();
        System.out.println("Songs: " + songs);

        //Iterate over the SongV2 objects and print their details
        for (SongV2 song : songs){
            System.out.println("Title: " + song.getTitle());
            System.out.println("Artist: " + song.getArtist());
            System.out.println("BPM: " + song.getBpm());
            System.out.println();
        }

    }
}