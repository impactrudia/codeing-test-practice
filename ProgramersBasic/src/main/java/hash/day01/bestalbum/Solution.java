package hash.day01.bestalbum;

import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        MusicInfo[] musicInfo = new MusicInfo[genres.length];
        HashMap<String, GenreInfo> hm = new HashMap<>();
        GenreInfo[] genreInfo; // 1. Make musicInfo array and Genre HashMap
        for (int i = 0; i < genres.length; i++) { // make music info
            musicInfo[i] = new MusicInfo();
            musicInfo[i].id = i;
            musicInfo[i].genre = genres[i];
            musicInfo[i].playCount = plays[i]; // make HashMap
            if (false == hm.containsKey(genres[i])) {
                GenreInfo genre = new GenreInfo(genres[i]);
                hm.put(genres[i], genre);
            }
        }
        // 2. Sort Music info by play count, descending order
        Arrays.sort(musicInfo);
        // 3. Fill HashMap with count and top two information
        for (MusicInfo music : musicInfo) {
            GenreInfo genre = hm.get(music.genre);
            genre.sum += music.playCount;
            if (genre.count < 2) genre.index[genre.count] = music.id;
            genre.count++;
        }

        // 4. Copy HashMap info to array for sorting and sort
        genreInfo = new GenreInfo[hm.size()];
        int idx = 0;
        int musicCount = 0;
        for (String key : hm.keySet()) {
            genreInfo[idx] = hm.get(key);
            musicCount += Math.min(genreInfo[idx].count, 2);
            idx++;
        }
        Arrays.sort(genreInfo);

        // 5. add answers to answer array
        answer = new int[musicCount];
        idx = 0;
        for (GenreInfo genre : genreInfo) {
            int limit = Math.min(genre.count, 2);
            for (int i = 0; i < limit; i++, idx++) {
                answer[idx] = genre.index[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution itc = new Solution();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        itc.solution(genres, plays);
    }
}