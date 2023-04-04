package com.devsuperior.application;

import com.devsuperior.UI;
import com.devsuperior.boardgame.Board;
import com.devsuperior.boardgame.Position;
import com.devsuperior.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}