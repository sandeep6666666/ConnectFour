package com.company.Model
public class ConnectFourGame{
    String [][] board;
    Boolean winner;
    Boolean draw;
    int winningPlayer;
    int playerTurn;
    public ConnectFourGame(){
        winningPlayer = 0;
        draw= false;
        playerTurn= 1;
        board = new String[6][7];
    }
    public void newBoard(){
        for (int i=0; i<6; i++){
            for(int i=0; i<7;i++){
                board[i][i]= " - ";
            }
        }
    }
}