public String wordEnds(String str, String word) {
    String result = "";
    int wordLen = word.length();

    for (int i = 0; i <= str.length() - wordLen; i++) {
        if (str.substring(i, i + wordLen).equals(word)) {
            if (i > 0) {
                result += str.charAt(i - 1);
            }
            if (i + wordLen < str.length()) {
                result += str.charAt(i + wordLen);
            }
        }
    }
    return result;
}
