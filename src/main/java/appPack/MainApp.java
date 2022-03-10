package appPack;
import org.jsoup.Jsoup;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        try{
                String url = "https://tcmb.gov.tr/kurlar/today.xml";
                String data = Jsoup.connect(url).timeout(30000).ignoreContentType(true).get().toString();
            System.out.println(data);
        } catch(Exception ex){
            System.err.println("xml error:"+ex);
        }
    }
}




