package GameBase.Chess.Figures;

import GameBase.Chess.ChessFigure;
import GameBase.Base.Coordinate;

public class Rook extends ChessFigure {
    public Rook(boolean colorIsWhite, Coordinate coordinateFrom) {
        super(colorIsWhite, colorIsWhite ? '\u2656' : '\u265c', coordinateFrom);
    }

    @Override
    public boolean canMove(Coordinate coordinateTo) {
        //TODO: how does Rook can move on chess board?
        boolean Step = (Math.abs(from.getX() - to.getX()) == 0 && Math.abs(from.getY() - to.getY()) <= 7) ||
                (Math.abs(from.getX() - to.getX()) <=7 && Math.abs(from.getY() - to.getY()) == 0);
        boolean Attack = (Math.abs(from.getX() - to.getX()) == 0 && Math.abs(from.getY() - to.getY()) <= 7) ||
                (Math.abs(from.getX() - to.getX()) <=7 && Math.abs(from.getY() - to.getY()) == 0);
        return Step || Attack;
    }
}
