import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class BoardGame {
    private Document document;

    public BoardGame(){
        connect();
    }
    private void connect(){
        try{
            document = Jsoup.connect().get();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public String getTitle(){
        return document.title();
    }
    public String getDescription(){
        Element element = document.getElementById();
        return element.text();
    }
    public String getNumberPlayers(){
        Element element = document.getElementsByClass();
        return element.text();
    }
    public String getImg(){
        Elements element = document.getElementsByClass("cover");
        String url = element.attr("style");
        url = url.replace("", "");
        url = url.replace(")'", "");
        return url;
    }
}
