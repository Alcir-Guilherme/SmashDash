import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
public class SmashDash extends JPanel implements ActionListener{
    int largura = 750;
    int altura = 450;

    //imagens jogador (provisorias)
    Image jogadorCorrendo;
    Image jogadorPulando;
    Image jogadorAgachando;


    class Block {
        int x;
        int y;
        int largura;
        int altura;
        Image imagem;

        Block( int x, int y,int largura, int altura ,Image imagem){
            this.x = x;
            this.y = y;
            this.largura = largura;
            this.altura = altura;
            this.imagem = imagem;
        }
    }

    // jogador valores
    int jogadorLargura = 55;
    int jogadorAltura = 94;
    int jogadorX = 50;
    int jogadorY = altura - jogadorAltura;

    Block jogador;

    Timer gameLoop;

    public SmashDash(){

        setPreferredSize(new Dimension(largura,altura));
        setBackground(Color.cyan);

        jogadorCorrendo = new ImageIcon(getClass().getResource("./imagens/jogador.correndo.png")).getImage();
        jogadorPulando =new ImageIcon(getClass().getResource("./imagens/jogadorpulando.png")).getImage();
        jogadorAgachando = new ImageIcon(getClass().getResource("./imagens/jogadoragachado.png")).getImage();

        //criando o jogador
        jogador = new Block(jogadorX,jogadorY,jogadorLargura,jogadorAltura,jogadorCorrendo);

        //game loop (aqui esta sendo feito a repeticao da imagem do jogador correndo
        gameLoop = new Timer(1000/60,this); // um looping de 1 sec
        gameLoop.start();

    }
    //chamando a funcao do JPanel
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        desenhando(g);
    }
    public void desenhando(Graphics g){
        g.drawImage(jogador.imagem, jogador.x, jogador.y, jogador.largura, jogador.altura, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

}
