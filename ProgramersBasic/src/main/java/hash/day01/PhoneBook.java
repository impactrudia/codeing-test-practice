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

    /**
     * 정확성: 83.3
     * 효율성: 16.7
     * 합계: 100.0 / 100.0
     */
    public boolean solution2(String[] phone_book) {
        // 정렬한다
        Arrays.sort(phone_book);
        boolean result = true;
        for (int i = 0; i < phone_book.length - 1; i++) {
            // 시작한다.
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] s_array = {"119", "97674223", "1195524421"};
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.solution(s_array);

        PhoneBook phoneBook2 = new PhoneBook();
        phoneBook2.solution2(s_array);
    }
}
