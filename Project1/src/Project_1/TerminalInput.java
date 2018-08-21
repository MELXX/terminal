package Project_1;

import terminal.MyTerminal;
import terminalEditor.ITerminalInput;

public class TerminalInput implements ITerminalInput  {
    private MyTerminal terminal;
    public  TerminalInput(MyTerminal Terminal){
        terminal = Terminal;
    }
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

}
