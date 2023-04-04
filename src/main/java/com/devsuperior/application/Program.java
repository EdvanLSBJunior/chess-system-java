package com.devsuperior.application;

import com.devsuperior.boardgame.Board;
import com.devsuperior.boardgame.Position;

public class Program {
    public static void main(String[] args) {

        Position position = new Position(2,4);
        System.out.println(position);

        Board board = new Board(8,8);
    }
}