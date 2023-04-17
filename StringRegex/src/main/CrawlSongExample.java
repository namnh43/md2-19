package main;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            System.out.println(content);
            
            content = content.replaceAll("\\n+", "");
            System.out.println(content);
            // regex
//            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
//            Matcher m = p.matcher(content);
//            while (m.find()) {
//                System.out.println(m.group(1));
//            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
