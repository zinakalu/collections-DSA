public class Jukebox8{
    public static void main(String[] args){
        new Jukebox8().go();
    }

    public void go(){
        List<SongV4> songList = MockMoreSongs.getSongsV4();
        System.out.println(songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        Set<SongV4> songSet = new TreeSet<>(songList);
        System.out.println(songSet);

        Set<SongV4> songSet = new TreeSet<>((o1, o2) -> o1.getBpm() - o2.getBpm());
        songSet.addAll(songList);
    }
}