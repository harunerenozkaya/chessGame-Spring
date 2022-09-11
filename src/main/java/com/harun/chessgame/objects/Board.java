package com.harun.chessgame.objects;

import com.harun.chessgame.enums.PieceColor;
import com.harun.chessgame.enums.PieceType;
import com.harun.chessgame.enums.PlayerType;

public class Board implements IBoard{
    private Piece[][] board;
    private boolean playerBlackIsChecked = false;
    private boolean playerWhiteIsChecked = false;

    public Board(){
        board = new Piece[8][8];

        board[0][0] = new Piece(PieceColor.BlackPiece,PieceType.Rook);
        board[0][1] = new Piece(PieceColor.BlackPiece,PieceType.Knight);
        board[0][2] = new Piece(PieceColor.BlackPiece,PieceType.Bishop);
        board[0][3] = new Piece(PieceColor.BlackPiece,PieceType.Queen);
        board[0][4] = new Piece(PieceColor.BlackPiece,PieceType.King);
        board[0][5] = new Piece(PieceColor.BlackPiece,PieceType.Bishop);
        board[0][6] = new Piece(PieceColor.BlackPiece,PieceType.Knight);
        board[0][7] = new Piece(PieceColor.BlackPiece,PieceType.Rook);

        board[1][0] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][1] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][2] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][3] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][4] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][5] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][6] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][7] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);

        board[2][0] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][1] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][2] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][3] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][4] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][5] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][6] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][7] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);

        board[3][0] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][1] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][2] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][3] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][4] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][5] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][6] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][7] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);

        board[4][0] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][1] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][2] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][3] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][4] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][5] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][6] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][7] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);

        board[5][0] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][1] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][2] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][3] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][4] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][5] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][6] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][7] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);

        board[6][0] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][1] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][2] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][3] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][4] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][5] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][6] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][7] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);

        board[7][0] = new Piece(PieceColor.WhitePiece,PieceType.Rook);
        board[7][1] = new Piece(PieceColor.WhitePiece,PieceType.Knight);
        board[7][2] = new Piece(PieceColor.WhitePiece,PieceType.Bishop);
        board[7][3] = new Piece(PieceColor.WhitePiece,PieceType.Queen);
        board[7][4] = new Piece(PieceColor.WhitePiece,PieceType.King);
        board[7][5] = new Piece(PieceColor.WhitePiece,PieceType.Bishop);
        board[7][6] = new Piece(PieceColor.WhitePiece,PieceType.Knight);
        board[7][7] = new Piece(PieceColor.WhitePiece,PieceType.Rook);
    }

    @Override
    public boolean movePiece(Movement movement, PlayerType playerType) {
        if(!controlMovement(movement,playerType))
            return false;

        doMovement(movement);
        return true;
    }
    @Override
    public boolean controlWinGame(PlayerType playerType) {
        return false;
    }

    @Override
    public void printBoard() {
        System.out.println("   ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        for(int i=0; i<8; i++){
            System.out.print(" " + (i+1) + " ");
            for(int j=0; j<8; j++){
                System.out.print("⎪ " + board[i][j].getIcon() + " ");
            }
            System.out.print("⎪\n");
            System.out.println("   ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        }
        System.out.println("     a   b   c   d   e   f   g   h");
        System.out.print("\n\n");
    }

    private boolean controlMovement(Movement movement,PlayerType playerType) {
        //TODO dont move if king will be checked
        //TODO taş hareket konumları arasındaki noktaların taş kontrolünü yap
        return  controlMovementByPlayerType(movement,playerType) &&
                controlMovementByPieceType(movement,playerType) &&
                controlMovementByPieceLocations(movement) &&
                controlMovementByKingChecked(movement,playerType);
    }

    private boolean controlMovementByKingChecked(Movement movement, PlayerType playerType) {
        doMovement(movement);

        if(controlPlayerIsChecked(playerType)){
            undoMovement(movement,board[movement.getTargetY()][movement.getTargetX()]);
            return false;
        }else{
            undoMovement(movement,board[movement.getTargetY()][movement.getTargetX()]);
            return true;
        }
    }

    private boolean controlMovementByPlayerType(Movement movement,PlayerType playerType){
        PieceColor sourcePieceColor = board[movement.getSourceY()][movement.getSourceX()].getColor();

        //White player can not move black pieces or vice a versa and empty pieces can not be moved
        return (playerType != PlayerType.WhitePlayer || sourcePieceColor != PieceColor.BlackPiece) &&
                (playerType != PlayerType.BlackPlayer || sourcePieceColor != PieceColor.WhitePiece);
    }

    private boolean controlMovementByPieceType(Movement movement,PlayerType playerType) {
        PieceType sourcePieceType = board[movement.getSourceY()][movement.getSourceX()].getType();

        switch (sourcePieceType){
            //Rook can move just horizontal or vertical
            case Rook:
                return movement.getSourceX() == movement.getTargetX() || movement.getSourceY() == movement.getTargetY();
            //Knight can move just like L
            case Knight:
                return Math.abs(movement.getTargetX()-movement.getSourceX()) == 1 && Math.abs(movement.getTargetY()-movement.getSourceY()) == 2 ||
                        Math.abs(movement.getTargetY()-movement.getSourceY()) == 1 && Math.abs(movement.getTargetX()-movement.getSourceX()) == 2;
            //Bishop can move in any direction diagonally
            case Bishop:
                return Math.abs(movement.getTargetX() - movement.getSourceX()) == Math.abs(movement.getTargetY() - movement.getSourceY());
            //Queen can move any direction
            case Queen:
                return movement.getSourceX() == movement.getTargetX() || movement.getSourceY() == movement.getTargetY() ||
                        Math.abs(movement.getTargetX() - movement.getSourceX()) == Math.abs(movement.getTargetY() - movement.getSourceY());
            //King can move one block distance to every direction
            case King:
                return  movement.getTargetY() == movement.getSourceY() && Math.abs(movement.getTargetX() - movement.getSourceX()) == 1 ||
                        movement.getTargetX() == movement.getSourceX() && Math.abs(movement.getTargetY() - movement.getSourceY()) == 1 ||
                        Math.abs(movement.getTargetX()-movement.getSourceX()) == 1 && Math.abs(movement.getTargetY()-movement.getSourceY()) == 1;
            //Pawn can move just 1 forward step
            case Pawn:
                if(playerType == PlayerType.WhitePlayer){
                    if(movement.getSourceY() == 6){
                        return  movement.getSourceY()-movement.getTargetY() <= 2 && movement.getSourceX() == movement.getTargetX() ||
                                movement.getSourceY()-movement.getTargetY() == 1 && movement.getSourceX() != movement.getTargetX() &&
                                board[movement.getTargetY()][movement.getTargetX()].getType() != PieceType.Empty;
                    }
                    else
                        return  movement.getSourceY()-movement.getTargetY() == 1 && movement.getSourceX() == movement.getTargetX() ||
                                movement.getSourceY()-movement.getTargetY() == 1 && movement.getSourceX() != movement.getTargetX() &&
                                board[movement.getTargetY()][movement.getTargetX()].getType() != PieceType.Empty;
                }
                else if(playerType == PlayerType.BlackPlayer){
                    if(movement.getSourceY() == 1){
                        return  movement.getTargetY()-movement.getSourceY() <= 2 && movement.getSourceX() == movement.getTargetX() ||
                                movement.getTargetY()-movement.getSourceY() == 1 && movement.getSourceX() != movement.getTargetX() &&
                                board[movement.getTargetY()][movement.getTargetX()].getType() != PieceType.Empty;
                    }
                    else
                        return  movement.getSourceY()-movement.getTargetY() == 1 && movement.getSourceX() == movement.getTargetX() ||
                                movement.getTargetY()-movement.getSourceY() == 1 && movement.getSourceX() != movement.getTargetX() &&
                                board[movement.getTargetY()][movement.getTargetX()].getType() != PieceType.Empty;
                }
            case Empty:
                return false;
        }

        return false;
    }


    private boolean controlMovementByPieceLocations(Movement movement) {
        return true;
    }


    private boolean controlPlayerIsChecked(PlayerType playerType) {
        return false;
    }

    private void doMovement(Movement movement){
        Piece sourcePiece = board[movement.getSourceY()][movement.getSourceX()];
        Piece targetPiece = board[movement.getTargetY()][movement.getTargetX()];

        targetPiece.setType(sourcePiece.getType());
        targetPiece.setColor(sourcePiece.getColor());
        targetPiece.setIcon(sourcePiece.getIcon());
        sourcePiece.setType(PieceType.Empty);
        sourcePiece.setColor(PieceColor.EmptyPiece);
        sourcePiece.setIcon(" ");
    }

    private void undoMovement(Movement movement ,Piece targetPiece){
        doMovement(new Movement(movement.getTargetX(),movement.getTargetY(),movement.getSourceX(), movement.getSourceY()));
        board[movement.getTargetY()][movement.getTargetX()].setType(targetPiece.getType());
        board[movement.getTargetY()][movement.getTargetX()].setColor(targetPiece.getColor());
        board[movement.getTargetY()][movement.getTargetX()].setIcon(targetPiece.getIcon());

    }
}
