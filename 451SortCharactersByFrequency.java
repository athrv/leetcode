class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(char c:s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        PriorityQueue<Character> maxHeap=new PriorityQueue<>((a, b) -> (map.get(b)-map.get(a)));
        maxHeap.addAll(map.keySet());

        StringBuilder res=new StringBuilder();
        while(!maxHeap.isEmpty()) {
            char c=maxHeap.poll();
            for(int i=0; i<map.get(c); i++) {
                res.append(c);
            }
        }
        return res.toString();
    }
}
