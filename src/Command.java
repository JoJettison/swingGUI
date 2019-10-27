public interface Command {
    //Command Pattern
    int  BOX = 1, CIR = 2, STR =3;

    public  void execute(int x, int y, int style);

    public  void  undo();

    public  void redo();

}
