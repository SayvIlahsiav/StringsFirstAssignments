import edu.duke.*;
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Part4 {
    public void listYoutubeLinks(){
        String result = "";
         URLResource ur = new URLResource("https://www.dukelearntoprogram.com/course2/data/manylinks.html");
         int i = 1;
         for (String url : ur.words()) {
             String s = url.toLowerCase();
             int index = s.indexOf("youtube.com");
             if (index != -1)
             {
                 int firstQuoteInd = url.lastIndexOf("\"", index);
                 int lastQuoteInd = url.indexOf("\"", index+1);
                 if (firstQuoteInd != -1 && lastQuoteInd != -1)
                 {
                     System.out.println("Link" + i + " : " + url.substring(firstQuoteInd+1, lastQuoteInd));
                     i = i+1;
                 }
             }
         }
    }
    
    public static void main(String args[])
    {
        Part4 p4 = new Part4();
        p4.listYoutubeLinks();
    }

}

