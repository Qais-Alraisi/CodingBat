String[] firstSwap(String[] strings) {
    java.util.Map<Character, Integer> map = new java.util.HashMap<>();
    java.util.Map<Character, Boolean> swapped = new java.util.HashMap<>();
    for (int i = 0; i < strings.length; i++) {
        char firstChar = strings[i].charAt(0);
        if (swapped.containsKey(firstChar) && swapped.get(firstChar)) {
            continue;
        }
        if (map.containsKey(firstChar)) {
            int prevIndex = map.get(firstChar);
            String temp = strings[i];
            strings[i] = strings[prevIndex];
            strings[prevIndex] = temp;
            swapped.put(firstChar, true);
            map.remove(firstChar);
        } else {
            map.put(firstChar, i);
            swapped.putIfAbsent(firstChar, false);
        }
    }
    return strings;
}
