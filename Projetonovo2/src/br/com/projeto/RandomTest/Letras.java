/*package br.com.projeto.RandomTest;
import java.util.Timer;
import java.util.TimerTask;

public class Letras {

    private String text;
    private int currentIndex;
    private Timer timer;

    public Letras(String text) {
        this.text = text;
        this.currentIndex = 0;
        this.timer = new Timer();
    }

    public void startAnimation(int delay) {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (currentIndex < text.length()) {
                    System.out.print(text.charAt(currentIndex));
                    currentIndex++;
                } else {
                    timer.cancel();
                }
//            }
        }, 0, delay);
    }

    public static void main(String[] args) {
        String sampleText = "Este é um exemplo de texto animado.";
        int delay = 100; // Ajuste o valor do delay conforme necessário para a velocidade da animação

        Letras animation = new Letras(sampleText);
        animation.startAnimation(delay);
    }
}*/