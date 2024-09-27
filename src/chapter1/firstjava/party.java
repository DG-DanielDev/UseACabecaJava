package chapter1.firstjava;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class party {
  public void buildInvite() {
    // Obtem a configuração gráfica atual
    GraphicsConfiguration ge = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
    Rectangle bounds = ge.getBounds();

    // Cria o Frame conforme a resolução da Tela
    Frame f = new Frame("Festa na cada do Tim!", ge);
    f.setSize(bounds.width/2, bounds.height/2);
    f.setLocation((bounds.width - f.getWidth())/2, (bounds.height - f.getHeight())/2);

    // Adiciona conteúdo ao Frame
    Label l = new Label("Party at Tim's");
    Button b = new Button("You bet");
    Button c = new Button("Shoot me");
    Button d = new Button("Ignore me");
    Panel p = new Panel();
    p.add(l);
    p.add(b);
    p.add(c);
    p.add(d);
    f.add(p);

    // Configurações do Frame
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        f.dispose(); // fecha o Frame ao clicar no botão de fechar (IDE não permite sem tal exceção)
      }
    });
  }

  public static void main(String[] args) {
    party p = new party();
    p.buildInvite();
  }
}
