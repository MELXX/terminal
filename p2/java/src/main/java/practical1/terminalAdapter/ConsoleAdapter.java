package practical1.terminalAdapter;

import terminal.MyTerminal;
import terminalEditor.ITerminal;
import terminalEditor.ITerminalInput;
import terminalEditor.ITerminalNavigator;
import terminalEditor.ITextWriter;

public class ConsoleAdapter implements ITerminal {
    private static ConsoleAdapter instance;
    private static MyTerminal terminal = MyTerminal.show();
    private ConsoleInput input = new ConsoleInput(terminal);
    private ConsoleOutput output = new ConsoleOutput(terminal);
    private ConsoleNavigator navigator = new ConsoleNavigator(terminal);

    public ITerminalInput getInput(){ return input;}

    public ITextWriter getOutput(){return output;}

    public int getWidth() {return terminal.getColumnCount();}

    public int getHeight() {return terminal.getRowCount();}

    public ITerminalNavigator getNavigator (){return navigator;}

    public void clear() {
        terminal.clearTerminalWindow();
    }

    private ConsoleAdapter() {
    }

    public static ConsoleAdapter getInstance() {

        if (instance == null)
            instance = new ConsoleAdapter();
        return instance;

    }

}
