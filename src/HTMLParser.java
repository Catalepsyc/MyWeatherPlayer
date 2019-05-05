import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;

public class HTMLParser {

   public static  void main(String[] args) throws IOException {

       ///////////////////////////////////////////////////////////////////////
       //...........Криво, сложно, но работает.........................../////
       ///////////////////////////////////////////////////////////////////////

        List<Article>listOfCity = new ArrayList<>();//создаем ArrayList объектов типа Article

            // List<String>FullList = new ArrayList<>();

       //Подключаемся к странице для парсинга
       Document myDocCity = Jsoup.connect("http://otzyvoteli.ru/goroda").get();
       Elements h1Elements = myDocCity.getElementsByAttributeValue("class","hot-article");

       //перебираем элементы и добавляем их в ArrayList объектов типа Article
       h1Elements.forEach (h1Element ->
        {
            Element aElement = h1Element.child(1);
           //ng url = aElement.attr("href");
            String title  = aElement.child(0).text();
            listOfCity.add(new Article(title));

        });
       //выводим то, что перебрали и нашли
        listOfCity.forEach(System.out::println);

        //У нас один элемент ArrayListа listOfCity с индексом 1

               // System.out.println(listOfCity.get(0).getName());

       //Разбиваем спарсенную информацию на отдельные элементы
       String sampleString = listOfCity.get(0).getName();
       System.out.println(sampleString);
       String[] items = sampleString.split(" ");
       List<String> itemList = new LinkedList<>(Arrays.asList(items));
               //Arrays.asList(items);


       //Удаляем из списка города длиной менее 2 символов
       for(int i = 0; i < itemList.size(); i++) {
           String citye = itemList.get(i);
           if (citye.length() <= 2) {
               itemList.remove(citye);
           }
       }

       //Выводим список городов
       for(String city : itemList) {
           System.out.println("city " + city);
           //System.out.println(itemList.get(0));

       }
       //Очищаем ArrayList объектов типа Article
       listOfCity.clear();

       //Перегоняем LinkedList itemList в ArrayList объектов типа Article
       for(int i=0; i<itemList.size(); i++) {
           String str = itemList.get(i);
          // System.out.println(str);
          listOfCity.add(new Article(str));
       }

       //выводим то, что перебрали и нашли
       listOfCity.forEach(System.out::println);

   }


}
class Article
{
    private  String name;


    @Override
    public String toString() {

        return "Article{" +
                "name='" + name + '\'' +
                '}';

    }

    public Article(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

