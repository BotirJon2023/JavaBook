package org.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pong extends JPanel implements ActionListener {
    private int ballX = 250, ballY = 250, ballDx = 2, ballDy = 2, ballDiameter = 30;
    private int paddleWidth = 10, paddleHeight = 100;
    private int leftPaddleY = 250, rightPaddleY = 250;
    private Timer timer;

    public Pong() {
        this.setPreferredSize(new Dimension(600, 600));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_W && leftPaddleY > 0) {
                    leftPaddleY -= 20;
                }
                if (e.getKeyCode() == KeyEvent.VK_S && leftPaddleY < getHeight() - paddleHeight) {
                    leftPaddleY += 20;
                }
                if (e.getKeyCode() == KeyEvent.VK_UP && rightPaddleY > 0) {
                    rightPaddleY -= 20;
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN && rightPaddleY < getHeight() - paddleHeight) {
                    rightPaddleY += 20;
                }
            }
        });
        timer = new Timer(5, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ballX += ballDx;
        ballY += ballDy;

        if (ballY <= 0 || ballY >= getHeight() - ballDiameter) {
            ballDy = -ballDy;
        }
        if (ballX <= paddleWidth && ballY >= leftPaddleY && ballY <= leftPaddleY + paddleHeight ||
                ballX >= getWidth() - ballDiameter - paddleWidth && ballY >= rightPaddleY && ballY <= rightPaddleY + paddleHeight) {
            ballDx = -ballDx;
        }
        if (ballX < 0 || ballX > getWidth()) {
            ballX = getWidth() / 2;
            ballY = getHeight() / 2;
        }

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, leftPaddleY, paddleWidth, paddleHeight);
        g.fillRect(getWidth() - paddleWidth, rightPaddleY, paddleWidth, paddleHeight);
        g.fillOval(ballX, ballY, ballDiameter, ballDiameter);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pong");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Pong());
        frame.pack();
        frame.setVisible(true);
    }
}
