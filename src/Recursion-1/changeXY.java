String changeXY(String str) {
    if (str.isEmpty()) {
        return "";
    }
    char first = str.charAt(0);
    if (first == 'x') {
        return 'y' + changeXY(str.substring(1));
    } else {
        return first + changeXY(str.substring(1));
    }
}
