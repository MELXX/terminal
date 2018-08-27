package practical1.terminalAdapter;

import terminal.MyTerminal;
import terminalEditor.Color;
import terminalEditor.ITerminalFormatter;

class ConsoleFormatter implements ITerminalFormatter {

        private MyTerminal terminal;
        public ConsoleFormatter (MyTerminal terminal) {
            this.terminal = terminal;
        }
        public void resetColours () {
            terminal.resetColors ();
        }

        public void setBackground (Color color) {
            terminal.setBackgroundColour (color);
        }

        public void setForeground (Color color) {
            terminal.setForegroundColour (color);
        }

    }
