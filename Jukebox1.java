import java.util.*;

public class Jukebox1{
    public static void main(String[] args){
        new Jukebox1().go();
    }

    public void go(){
        List<String> songList = MockSongs.getSongStrings();
        Collections.sort(songList);
        System.out.println(songList);
    }
}

class MockSongs{
    public static List<String> getSongStrings(){
        List<String> songs = new ArrayList<>();
        songs.add("Say cheese");
        songs.add("Komole");
        songs.add("Who's your guy?");
        songs.add("Jolie");
        songs.add("F.U.N");
        songs.add("Attends");

        return songs;
    }
}


