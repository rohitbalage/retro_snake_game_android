package com.rrbofficial.retrosnake;

public class Snake {
    private int snakeX, snakeY;
    public Snake(int snakeX, int snakeY){
        this.snakeX = snakeX;
        this.snakeY = snakeY;
    }

    public int getSnakeX() {
        return snakeX;
    }

    public void setSnakeX(int snakeX) {
        this.snakeX = snakeX;
    }

    public int getSnakeY() {
        return snakeY;
    }

    public void setSnakeY(int snakeY) {
        this.snakeY = snakeY;
    }
}
