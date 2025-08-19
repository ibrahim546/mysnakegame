package main; // paket adı, klasör adıyla aynı olmak zorundadır.

// import edilen modüller
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Main {
    // Değişkenler
    private static int width = 600;
    private static int height = 600;

    // Başlangıç fonskiyonu tüm prorgam buradan başlar.
    public static void main(String[] args)
    {
        // Yarat
        JFrame window = new JFrame("Merhaba java. Merhaba Swing");
        JPanel canvas = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // g bizim kalemimiz
                g.setColor(Color.green);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        // Özellikleri belirle
        window.setSize(width,height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());
        window.add(canvas, BorderLayout.CENTER);
        window.setVisible(true);
    }

}
