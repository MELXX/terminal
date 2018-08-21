package Project_1;

import terminal.MyTerminal;

public class TerminalNavigator implements terminalEditor.ITerminalNavigator {
    MyTerminal Terminal;
    public  TerminalNavigator(MyTerminal terminal)
    {
        Terminal = terminal;
    }
    @Override
    public void moveCursorTo(int i, int i1) {

        Terminal.moveCursorTo(i,i1);
    }
}
