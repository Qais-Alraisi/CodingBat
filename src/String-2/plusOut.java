public String plusOut(String str, String word) {
    String newString = "";
    int i = 0;
    for (; i < str.length(); ) {
        if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
            newString += word;
            i += word.length();
        } else {
            newString += "+";
            i++;
        }
    }
    return newString;
}
