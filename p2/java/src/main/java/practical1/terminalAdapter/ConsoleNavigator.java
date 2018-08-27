package practical1.terminalAdapter;

import terminal.MyTerminal;
import terminalEditor.ITerminalNavigator;

class ConsoleNavigator implements ITerminalNavigator {
        private MyTerminal terminal;
        public ConsoleNavigator (MyTerminal terminal) {
            this.terminal = terminal;
        }
        public void moveCursorTo (int row, int col) {
            terminal.moveCursorTo (col, row);
        }
    }
