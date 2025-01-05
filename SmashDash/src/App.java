import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception{
        int largura = 750;
        int altura = 450;

        JFrame janela = new JFrame("SmashDash");

        janela.setSize(largura,altura);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SmashDash smashDash = new SmashDash();
        janela.add(smashDash);
        janela.pack();
        janela.setVisible(true);
    }
}
