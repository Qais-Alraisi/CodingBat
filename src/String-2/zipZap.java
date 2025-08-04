public String zipZap(String str) {
    String newString = "";
    for (int i = 0; i < str.length(); ) {
        if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
            newString += "zp";
            i += 3;
        } else {
            newString += str.charAt(i);
            i++;
        }
    }
    return newString;
}
