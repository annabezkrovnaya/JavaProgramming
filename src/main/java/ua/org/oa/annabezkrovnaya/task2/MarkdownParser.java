package ua.org.oa.annabezkrovnaya.task2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarkdownParser {

    public String markdownParser(String s){
        //finds header and wraps with tag <h2>...</h2>
        Pattern pattern1 = Pattern.compile("(\\#{2})(.+)");
        Matcher matcher1 = pattern1.matcher(s);
        String result1 = matcher1.replaceAll("<h2>$2</h2>");

        //finds empathy with '**' and  wraps with tag <strong>...</strong>
        Pattern pattern2 = Pattern.compile("(\\*{2})(\\w+)(\\*{2})");
        Matcher matcher2 = pattern2.matcher(result1);
        String result2 = matcher2.replaceAll("<strong>$2</strong>");

        //finds empathy with '*' and  wraps with tag <em>...</em>
        Pattern pattern3 = Pattern.compile("(\\*{1})(\\w+)(\\*{1})");
        Matcher matcher3 = pattern3.matcher(result2);
        String result3 = matcher3.replaceAll("<em>$2</em>");

        //find links and wraps with tag <a href=>...</a>
        Pattern pattern4 = Pattern.compile("(\\[)([A-z\\s]+)(\\])(\\()(https:\\/\\/www\\.\\w+\\.\\w{2,3})(\\))");
        Matcher matcher4 = pattern4.matcher(result3);
        String result4 = matcher4.replaceAll("<a href=\"$5\">$2</a>");

        //find all simple strings except header and wraps with tag <p>...</p>
        Pattern pattern5 = Pattern.compile("(^(?!<h2>))(.*)", Pattern.MULTILINE);
        Matcher matcher5 = pattern5.matcher(result4);
        String result5 = matcher5.replaceAll("<p>$2</p>");

        return result5;
    }
}
