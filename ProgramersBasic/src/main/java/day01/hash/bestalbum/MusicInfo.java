package day01.hash.bestalbum;

public class MusicInfo implements Comparable<MusicInfo> {
    int id;
    String genre;
    int playCount;

    int getPlayCount() {
        return playCount;
    }

    @Override
    public int compareTo(MusicInfo o) {
        int compareQuantity = ((MusicInfo) o).getPlayCount();

        //descending order
        return compareQuantity = this.playCount;
    }
}
