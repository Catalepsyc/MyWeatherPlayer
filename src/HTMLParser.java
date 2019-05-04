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
        List<Article>listOfEurope = new ArrayList<>();
        List<Article>listOfRussia = new ArrayList<>();
        List<Article>FullList = new ArrayList<>();

       // Document myDocEurope = Jsoup.connect("https://www.tema.ru/travel/cities/european").get(); version1
       Document myDocEurope = Jsoup.connect("https://avtoturistu.ru/page/список_городов_Европы").get();
       Document myDocRussia = Jsoup.connect("https://ru.wikipedia.org/wiki/Список_городов_России").get();

      // Elements h1Elements = myDocEurope.getElementsByAttributeValue("class","main-table w100"); version 1
       Elements h1Elements = myDocEurope.getElementsByAttributeValue("class","content");


               //("class", "mw-parser-output");
      // Elements h1Elements = myDocRussia.getElements
        //standard sortable jquery-tablesorter
        h1Elements.forEach (h1Element ->
        {
            Element aElement = h1Element.child(0);
           //ng url = aElement.attr("href");
            String title  =aElement.child(0).text();
            listOfEurope.add(new Article(title));

        });
        listOfEurope.forEach(System.out::println);
        System.out.println(listOfEurope.get(1));



   }

    static class Article
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

}
