package practical1.terminalAdapter;

import terminal.MyTerminal;
import terminalEditor.ITerminalFormatter;
import terminalEditor.ITextWriter;

class ConsoleOutput implements ITextWriter {
    private MyTerminal terminal;

    public ITerminalFormatter getFormatter() {
        return new ConsoleFormatter(terminal);
    }

    public ConsoleOutput(MyTerminal terminal) {
        this.terminal = terminal;
    }

    //Some default formatter
    public void writeLine(String text, String... args) {
        terminal.writeLineToTerminal(String.format(text, args));
    }

    public void write(String text, String... args) {
        terminal.writeToTerminal(String.format(text, args));
    }

}
