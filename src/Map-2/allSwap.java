String[] allSwap(String[] strings) {
    java.util.Map<Character, Integer> map = new java.util.HashMap<>();
    for (int i = 0; i < strings.length; i++) {
        char firstChar = strings[i].charAt(0);
        if (map.containsKey(firstChar)) {
            int prevIndex = map.get(firstChar);
            String temp = strings[i];
            strings[i] = strings[prevIndex];
            strings[prevIndex] = temp;
            map.remove(firstChar);
        } else {
            map.put(firstChar, i);
        }
    }
    return strings;
}
