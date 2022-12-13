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
        System.out.println(mainJsonString.toString());

        JSONParser parserString = new JSONParser();
        Object parserObject = parserString.parse(mainJsonString.toString());
        JSONObject jo = (JSONObject) parserObject;
        String Name = (String) jo.get("Name");
        

//        String mainString = new String("name:\"Ivanov\", country:\"Russia\", city:\"Moscow\", age:\"null\"");

//        String oldString = "select * from students where ";
        StringBuilder oldString = new StringBuilder("select * from students where ");


        String newString = oldString.append("append # 1").toString();


        System.out.println("string = " + oldString);
//        System.out.println("length = " + oldString.length());
//        System.out.println("capacity = " + oldString.capacity());

//        System.out.println("Hello world!");



    }
}