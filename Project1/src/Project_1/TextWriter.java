package Project_1;

import terminal.MyTerminal;
import terminalEditor.ITerminalFormatter;

public class TextWriter implements terminalEditor.ITextWriter {


    private ITerminalFormatter Formatter;
    private MyTerminal Terminal;

    public TextWriter(ITerminalFormatter obj,MyTerminal terminal){
        Terminal = terminal;
        Formatter = obj;
    }

    @Override
    public void write(String s, String... strings) {Terminal.writeToTerminal(s,strings); }

    @Override
    public void writeLine(String s, String... strings) {
        Terminal.writeLineToTerminal(s,strings);
    }

    @Override
    public ITerminalFormatter getFormatter() { return Formatter; }
}
