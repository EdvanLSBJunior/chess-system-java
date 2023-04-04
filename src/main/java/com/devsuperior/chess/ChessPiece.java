package com.devsuperior.chess;

import com.devsuperior.boardgame.Board;
import com.devsuperior.boardgame.Piece;
import com.devsuperior.chess.enums.Color;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
