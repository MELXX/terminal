package practical1;

import practical1.singleton.TerminalWindowSingleton;
import practical1.terminalAdapter.ConsoleAdapter;
import terminalEditor.ITerminal;

class main {
        public static void main (String[] args) {
            //Lazy initialised
            ITerminal terminal = ConsoleAdapter.getInstance();
            //Non-lazy initialized
            TerminalWindowSingleton.createNew (terminal);
        }
    }