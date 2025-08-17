package main; // paket adı, klasör adıyla aynı olmak zorundadır.

// import edilen modüller
import javax.swing.JFrame;
import javax.swing.JButton;

public class Main {

    // Başlangıç fonskiyonu tüm prorgam buradan başlar.
    public static void main(String[] args)
    {
        // Oluştur
        JFrame window = new JFrame("Merhaba java. Merhaba Swing");
        JButton button = new JButton("Tıkla");

        // Özellikleri belirle
        window.setSize(300,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(button);
        window.setVisible(true);
    }

}
