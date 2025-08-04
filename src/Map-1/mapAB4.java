public Map<String, String> mapAB4(Map<String, String> map) {
  if (map.containsKey("a") && map.containsKey("b")) {
    String aValue = map.get("a");
    String bValue = map.get("b");
    if (aValue.length() == bValue.length()) {
      map.put("a", "");
      map.put("b", "");
    } else if (aValue.length() > bValue.length()) {
      map.put("c", aValue);
    } else {
      map.put("c", bValue);
    }
  }
  return map;
}

