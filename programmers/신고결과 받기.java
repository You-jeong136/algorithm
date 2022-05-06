import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        //누가 , 누구누구를 신고했는지.
        Map<String, Set<String>> reported = new HashMap<>();
        // 누가 몇번 신고 당했는지
        Map<String, Integer> total = new HashMap<>();
        
        //초기화
        for(int i = 0; i < id_list.length; i++){
            HashSet<String> reportedId = new HashSet<String>();
            reported.put(id_list[i], reportedId);
            total.put(id_list[i], 0);
        }
        
        //누가 -> 누구 신고 기록. 
        for (String r : report) {
            StringTokenizer st = new StringTokenizer(r, " ");
            String from = st.nextToken();
            String to = st.nextToken();
            
            // from 신고 기록set에 to 이미 있을 경우 false, 처음이면 true.
            if(reported.get(from).add(to)){
                total.replace(to, total.get(to) + 1);
            }
        }
        
        // 신고한 적 있는 id(from)의 경우 _ 
        // id(from)의 신고기록에서 해당 id(to)가 k번 이상 신고 된 적 있는지 확인, answer++
        for(int i = 0; i < id_list.length; i++){
            if(reported.containsKey(id_list[i])){
                for(String id : reported.get(id_list[i]) ) {
                    if(total.get(id) >= k){
                        answer[i]++;
                    }
                }
            }
        }
        
        return answer;
    }
}