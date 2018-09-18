package practical1.terminalAdapter;

import terminal.MyTerminal;
import terminalEditor.ITerminalInput;

import static java.awt.event.KeyEvent.*;

class ConsoleInput implements ITerminalInput {
    private MyTerminal terminal;

    public ConsoleInput(MyTerminal terminal) {
        this.terminal = terminal;
    }

    public void start() {
       
    }

    public void stop() {
        terminal.close();
    }
}
