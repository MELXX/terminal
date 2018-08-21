package Project_1;

import terminal.MyTerminal;
import terminalEditor.*;

public  class Terminal implements terminalEditor.ITerminal {
    //I, melxxx, added this_____________________________________________________________________________________

    private static Terminal terminal;
    private ITerminalNavigator navigator;
    private ITextWriter textWriter;
    private ITerminalInput terminalInput;
    private ITerminalFormatter terminalFormatter;
    private  MyTerminal t;

    public static Terminal GetTerminal() {
        if (terminal == null)
            terminal = new Terminal();

        return terminal;
    }

    private Terminal() {

        t = MyTerminal.show();
        navigator = new TerminalNavigator(t);
        terminalFormatter = new TerminalFormatter(t);
        textWriter = new TextWriter(terminalFormatter,t);
        terminalInput = new TerminalInput(t);


    }

    @Override
    public ITerminalInput getInput() {
        //added
        return terminalInput;
        // return null;
    }

    @Override
    public ITextWriter getOutput() {
        //added
        return textWriter;
        //return null;
    }

    @Override
    public ITerminalNavigator getNavigator() {
        //added
        return navigator;
        //return null;
    }

    @Override
    public int getHeight() {

        return t.getRowCount();
    }

    @Override
    public int getWidth() {

        return t.getColumnCount();
    }

    @Override
    public void clear() {
        t.clearTerminalWindow();
    }


}