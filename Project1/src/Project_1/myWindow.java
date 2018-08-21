package Project_1;

import terminalEditor.Color;
import terminalEditor.ITerminal;


public class myWindow implements terminalEditor.ITerminalWindow{
    private ITerminal terminal;
    private static myWindow window;

    public static myWindow GetWindow(){
        if (window == null)
            window= new myWindow();


        return window;
    }

    private myWindow() {

        terminal = Terminal.GetTerminal();
    }

    @Override
    public ITerminal getOwner() {
        // code added here
        return Terminal.GetTerminal();
    }

    @Override
    public int getWidth() {
        return terminal.getWidth();
    }

    @Override
    public int getHeight() {
        return terminal.getHeight();
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void changeArea(int i, int i1, int i2, int i3) {

    }

    @Override
    public void render() {

        terminalEditor.ITerminal TerminalInstance = window.getOwner();

        TerminalInstance.clear();
        TerminalInstance.getNavigator().moveCursorTo(TerminalInstance.getWidth()/2,TerminalInstance.getHeight()/2);

        TerminalInstance.getOutput().getFormatter().setBackground(Color.BLACK);
        TerminalInstance.getOutput().getFormatter().setForeground(Color.WHITE);
        TerminalInstance.getOutput().writeLine("CSIE2664 Practical 1");
        TerminalInstance.getNavigator().moveCursorTo(TerminalInstance.getWidth()/2,TerminalInstance.getHeight()/2+1);

        TerminalInstance.getOutput().writeLine("   Kenneth Mgwenya");
        TerminalInstance.getNavigator().moveCursorTo(TerminalInstance.getWidth()/2,TerminalInstance.getHeight()/2+2);

        TerminalInstance.getOutput().writeLine("    2016089506");

    }
}

