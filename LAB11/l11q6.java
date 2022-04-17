import java.applet.Applet;  
import java.awt.Graphics;  
  
public class l11q6 extends Applet {

    public void paint(Graphics g) {
        String name = getParameter("name");
        String isbn = (getParameter("isbn"));
        String author = getParameter("author");
        g.drawString(name + " " + isbn + " " + author, 250, 250);
    }

}

/*
<html>  
    <body>  
        <applet code="l11q6.class" width="300" height="300">  
        <param name="name" value="Programming in ANSI C ">
        <param name="isbn" value="2006270">
        <param name="author" value="BALAGURUSAMMY">    
        </applet>  
    </body>  
</html>  
*/