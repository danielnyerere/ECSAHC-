String json = ...; // Your json string.
JsonArray jsonArr = new JsonParser().parse(json).getAsJsonArray();
for(int i = 0; i < jsonArr.size(); i++) {
    JsonObject jsonObj = jsonArr.get(i).getAsJsonObject();
   
    String uuid = jsonObj.get("uuid").getAsString();
    // we can do anything with the uuid.
}