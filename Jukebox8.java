public class Jukebox8{
    public static void main(String[] args){
        new Jukebox8().go(); //an instance of 'Jukebox8' is created and the 'go()' method is called on it
    }

    public void go(){
        List<SongV4> songList = MockMoreSongs.getSongsV4(); //A
        System.out.println(songList); //prints the original list of songs

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle())); //B
        System.out.println(songList); //prints the sorted list of songs

        Set<SongV4> songSet = new TreeSet<>(songList); //C
        System.out.println(songSet); //the method prints the 'TreeSet' of songs, which should be sorted and without duplicates

        Set<SongV4> songSet2 = new TreeSet<>((o1, o2) -> o1.getBpm() - o2.getBpm());
        System.out.println(songSet2);
        songSet.addAll(songList);
    }
}

//A: the method retireves a list of 'SongV4' objects by calling 'MockMoreSongs.getSongsV4'
//B: the method sorts the list of songs in ascending order of the song titles.
//C: the method creates a 'TreeSet' from the sorted list of songs