public Map<String, String> mapAB3(Map<String, String> map) {
  if (map.containsKey("a") && (!map.containsKey("b") || map.get("b").isEmpty())) {
    map.put("b", map.get("a"));
  }

  if (map.containsKey("b") && (!map.containsKey("a") || map.get("a").isEmpty())) {
    map.put("a", map.get("b"));
  }

  return map;
}
