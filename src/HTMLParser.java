import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class HTMLParser {

   public static  void main(String[] args) throws IOException {

        List<Article>listOfCity = new ArrayList<>();
        List<String>FullList = new ArrayList<>();


       Document myDocCity = Jsoup.connect("http://otzyvoteli.ru/goroda").get();
       //Document myDocRussia = Jsoup.connect("https://33tura.ru/goroda-rossii").get();

      // Elements h1Elements = myDocEurope.getElementsByAttributeValue("class","content");
       Elements h1Elements = myDocCity.getElementsByAttributeValue("class","hot-article");


        h1Elements.forEach (h1Element ->
        {
            Element aElement = h1Element.child(1);
           //ng url = aElement.attr("href");
            String title  = aElement.child(0).text();
            listOfCity.add(new Article(title));

        });
        listOfCity.forEach(System.out::println);
        //У нас один элимент ArrayListа listOfCity с индексом 1
        //System.out.println(listOfCity.get(0));
      System.out.println(listOfCity.get(0).getName());
      //Создаем массив строк
      // ArrayList<String> goroda = new ArrayList<String>();
//Разбиваем спарсенную информацию на отдельные элементы
       String sampleString = listOfCity.get(0).getName();
       System.out.println(sampleString);
       String[] items = sampleString.split(" ");
       List<String> itemList = Arrays.asList(items);
      // System.out.println(itemList.get(0));


       System.out.println(itemList.get(0));







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

