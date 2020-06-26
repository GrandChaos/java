package ru.sbrf.jc.demo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Command[] cmds = {
	        new QuitCommand(),
            new TimeCommand(),
            new DateCommand()
	    };
	    while (true){
	        System.out.print("-->");
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            String[] cmd = line.split(" ");
            boolean done = false;
            for (Command command: cmds) {
                if (cmd[0].equals(command.getName())){
                    command.execute(cmd);
                    done = true;
                }
            }
            if (!done) System.out.println("Команда не найдена");
        }
    }
}

interface Command {
    String getName();
    void execute(String[] args);
}

class QuitCommand implements Command {

    @Override
    public String getName(){
        return "quit";
    }

    @Override
    public void execute(String[] args){
        System.exit(0);
    }
}

class TimeCommand implements Command {

    @Override
    public String getName(){
        return "time";
    }

    @Override
    public void execute(String[] args){
        System.out.println(LocalTime.now().toString());
    }
}

class DateCommand implements Command {

    @Override
    public String getName(){
        return "date";
    }

    @Override
    public void execute(String[] args){
        System.out.println(LocalDate.now().toString());
    }
}