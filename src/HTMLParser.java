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


   }


}
class Article
{
   public  String name;


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

