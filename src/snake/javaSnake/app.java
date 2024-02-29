package snake.javaSnake;
import javax.swing.*;
public class app {
    public static void main(String[] args) {
        int boardWidth = 600;
        int boardHeight = boardWidth;
        JFrame frame = new JFrame("Snake");
        frame.setSize(boardWidth,boardHeight);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        snakeGame snake = new snakeGame(boardWidth,boardHeight);
        frame.add(snake);
        frame.pack();
        snake.requestFocus();
    }
}
