String wordAppend(String[] strings) {
    java.util.Map<String, Integer> counts = new java.util.HashMap<>();
    String result = "";
    for (int i = 0; i < strings.length; i++) {
        String s = strings[i];
        if (counts.containsKey(s)) {
            counts.put(s, counts.get(s) + 1);
        } else {
            counts.put(s, 1);
        }
        if (counts.get(s) % 2 == 0) {
            result = result + s;
        }
    }
    return result;
}
