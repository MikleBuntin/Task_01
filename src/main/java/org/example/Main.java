/*
Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
*/


package org.example;
//import org.json.simple.*;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        JSONObject mainJsonString = new JSONObject();
        mainJsonString.put("name","Ivanov");
        mainJsonString.put("country","Russia");
        mainJsonString.put("city","Moscow");
        mainJsonString.put("age","null");
        System.out.println("JSon string: " + mainJsonString);

        StringBuilder oldString = new StringBuilder("select * from students where ");
        String name = (String) mainJsonString.get("name");
        if (name != "null") {
            oldString = oldString.append("name =\"" + name + "\"");
        }
        String country = (String) mainJsonString.get("country");
        if (country != "null") {
            oldString = oldString.append(", country =\"" + country + "\"");
        }
        String city = (String) mainJsonString.get("city");
        if (city != "null") {
            oldString = oldString.append(", city =\"" + city + "\"");
        }
        String age = (String) mainJsonString.get("age");
        if (age != "null") {
            oldString = oldString.append(", age =\"" + age + "\"");
        }
        System.out.println("SQL_String: " + oldString.toString());

    }
}