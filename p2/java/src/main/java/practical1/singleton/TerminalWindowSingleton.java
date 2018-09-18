package practical1.singleton;

import terminalEditor.*;

public class TerminalWindowSingleton implements ITerminalWindow {
    private ITerminal terminal;

    public ITerminal getOwner() {
        return terminal;
    }

    static TerminalWindowSingleton instance;

    public static TerminalWindowSingleton getInstance() {
        return instance;
    }

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public int getWidth() {
        return terminal.getWidth();
    }

    public int getHeight() {
        return terminal.getHeight();
    }

    public static void createNew(ITerminal terminal) {
        instance = new TerminalWindowSingleton(terminal);
        instance.render();
        instance.getOwner().getInput().start();
    }

    private TerminalWindowSingleton(ITerminal terminal) {
        this.terminal = terminal;
    }

    public void render() {
        terminal.clear();
        //Write some stuff to the window for now
        ITextWriter writer = getOwner().getOutput();
        writer.getFormatter().setBackground(Color.GREEN);
        writer.getFormatter().setForeground(Color.WHITE);
        ITerminalNavigator nav = getOwner().getNavigator();
        String message = "CSIE2664 Practical 1";
        nav.moveCursorTo(getOwner().getHeight() / 2, (getOwner().getWidth() - message.length()) / 2);
        writer.write(message);
        writer.getFormatter().resetColours();

        String nameAndSurname = "Jean-Pierre du Plessis";
        nav.moveCursorTo(getOwner().getHeight() / 2 + 1, (getOwner().getWidth() - nameAndSurname.length()) / 2);
        writer.writeLine(nameAndSurname);
        String studentNum = "2018123545";
        nav.moveCursorTo(getOwner().getHeight() / 2 + 2, (getOwner().getWidth() - studentNum.length()) / 2);
        writer.writeLine(studentNum);

    }

    public void changeArea(int x, int y, int width, int height) {
    }
}