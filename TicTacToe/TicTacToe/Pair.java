package TicTacToe;

public class Pair<T1, T2> {
    T1 p1;
    T2 p2;

    Pair(){

    }
    void setValue(T1 a, T2 b)
    {
        this.p1 = a;
        this.p2 = b;
    }

    Pair<T1, T2> getValue()
    {
        return this;
    }
}
