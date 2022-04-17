import java.awt.*;
import java.applet.*;
import java.net.*;

public class l11q7 extends Applet {
    
    public void paint(Graphics g) {
        String msg;
        URL url = getCodeBase();
        msg = "Code base: " + url.toString();
        g.drawString(msg, 10, 20);
        url = getDocumentBase();
        msg = "Document base: " + url.toString();
        g.drawString(msg, 10, 40);
    }

}

/*
    <applet code="l11q7" width=300 height=150> </applet>
*/