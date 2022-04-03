package day01.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InabilityToComplete {

    public String solution(String[] participant, String[] completion) {
        //1. 두 배열을 정렬한다.
        Arrays.sort(participant);
        Arrays.sort(completion);

        //2. 두 배열이 다를 때까지 찾는다
        int findIdx = participant.length - 1;
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                findIdx = i;
                break;
            }
        }

        //3. 여기까지 왔다는 것은 마지막 주자가 완주하지 못했다는 의미
        return participant[findIdx];
    }

    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
        for (String player : completion) {
            hm.put(player, hm.get(player) - 1);
        }

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }

    public String solution3(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        for (String player : completion)
            map.put(player, map.get(player) - 1);

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        String[] part2 = {"A", "C", "B"};
        String[] comp2 = {"B", "C"};

        InabilityToComplete itc = new InabilityToComplete();
//        System.out.println(itc.solution(part, comp));
        System.out.println(itc.solution(part2, comp2));
    }
}
