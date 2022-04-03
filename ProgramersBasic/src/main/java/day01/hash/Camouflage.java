package day01.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import static java.util.stream.Collectors.*;

public class Camouflage {
    static public int solution(String[][] clothes) {
        //1. 옷을 종류별로 구분하기
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        //2. 입지 않는 경우를 추가하여 모든 조합 계산하기
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;

        while (it.hasNext())
            answer *= it.next().intValue() + 1;

        //3. 아무종류의 옷도 입지 않는 경우 제외하기
        return answer - 1;
    }

    public static int solution2(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream().reduce(1L, (x, y) -> x * (y + 1)).intValue() - 1;
    }

    public static int solution3(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }
        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        solution(clothes);
        solution2(clothes);
        solution3(clothes);
    }
}