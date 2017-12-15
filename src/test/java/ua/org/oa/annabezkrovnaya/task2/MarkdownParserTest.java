package ua.org.oa.annabezkrovnaya.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarkdownParserTest {
    @Test
    public void markdownParser() throws Exception {
        MarkdownParser parser = new MarkdownParser();
        String actual = parser.markdownParser("##Header line\n" +
                "Simple line *with* em\n" +
                "Simple **line** with strong\n" +
                "Line with link [Link to google](https://www.google.com) in center\n" +
                "Line **with** *many* **elements** and link [Link to FB](https://www.facebook.com)");

        String expected = "<h2>Header line</h2>\n" +
                "<p>Simple line <em>with</em> em</p>\n" +
                "<p>Simple <strong>line</strong> with strong</p>\n" +
                "<p>Line with link <a href=\"https://www.google.com\">Link to google</a> in center</p>\n" +
                "<p>Line <strong>with</strong> <em>many</em> <strong>elements</strong> and link <a href=\"https://www.facebook.com\">Link to FB</a></p>";

        assertEquals(expected, actual);
    }
}