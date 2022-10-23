package Chess.Figures;

import Chess.ChessFigure;
import Chess.Base.Coordinate;

public class Bishop extends ChessFigure {
    public Bishop(boolean colorIsWhite, Coordinate coordinateFrom) {
        super(colorIsWhite, colorIsWhite ? '\u2657' : '\u265d', coordinateFrom);
    }

    @Override
    public boolean canMove(Coordinate coordinateTo) {
        //TODO: how does Bishop can move on chess board?
        return false;
    }
}
