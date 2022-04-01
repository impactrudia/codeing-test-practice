package hash.day01;

import java.util.*;

public class PhoneBook {
    /**
     * 정확성: 83.3
     * 효율성: 16.7
     * 합계: 100.0 / 100.0
     */
    public boolean solution(String[] phone_book) {
        //1. HashMap을 선언한다.
        HashMap<String, Integer> map = new HashMap<>();

        //2. 모든 전화번호를 HashMap에 넣는다.
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        //3. 모든 전화번호의 subString이 HashMap에 존재하는지 확인한다.
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] s_array = {"119", "97674223", "1195524421"};
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.solution(s_array);
    }
}
