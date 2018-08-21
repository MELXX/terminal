package Project_1;

import terminal.MyTerminal;
import terminalEditor.Color;
public class TerminalFormatter implements  terminalEditor.ITerminalFormatter {

    MyTerminal Terminal;
    private Color BackgroundColor, ForegroundColor;

    public TerminalFormatter(MyTerminal terminal) {
        Terminal = terminal;
        BackgroundColor = Color.BLACK;
        ForegroundColor = Color.WHITE;
    }

    @Override
    public void setBackground(Color color) {

        BackgroundColor = color;
        Terminal.setBackgroundColour(BackgroundColor);
    }

    @Override
    public void setForeground(Color color) {
        ForegroundColor = color;
        Terminal.setForegroundColour(ForegroundColor);

    }

    @Override
    public void resetColours() {
        BackgroundColor = Color.BLACK;
        ForegroundColor = Color.WHITE;
    }
}
