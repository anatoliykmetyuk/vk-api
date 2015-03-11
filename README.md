VK API
======
An API to access VK developer methods. For example:
```scala
val api = VkApi(your_token)
val parameters = Map(
  "count"   -> "10",
  "city"    -> "292",
  "country" -> "2",
  "sex"     -> "1",
  "age_to"  -> "25"
)
api.method("users.search", parameters)
```