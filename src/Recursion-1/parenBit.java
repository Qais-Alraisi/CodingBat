String parenBit(String str) {
    if (str.isEmpty()) {
        return "";
    }
    if (str.charAt(0) == '(') {
        if (str.charAt(0) == ')' || str.indexOf(')') == 0) {
            return ")";
        }
        int closingIndex = str.indexOf(')');
        return str.substring(0, closingIndex + 1);
    } else {
        return parenBit(str.substring(1));
    }
}
