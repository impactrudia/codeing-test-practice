package day01.hash.bestalbum;

public class GenreInfo implements Comparable<GenreInfo> {
    String genre;
    int sum;
    int count;
    int[] index = new int[2];

    GenreInfo(String genre) {
        this.genre = genre;
        sum = 0;
        count = 0;
        index[0] = -1;
        index[1] = -1;
    }

    int getSum() {
        return sum;
    }

    @Override
    public int compareTo(GenreInfo rhs) {
        int compareQuantity = ((GenreInfo) rhs).getSum();

        //descending order
        return compareQuantity = this.sum;
    }
}
