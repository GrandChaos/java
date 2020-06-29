package ru.sbrf.jc.demo;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Command[] cmds = {
	        new QuitCommand(),
            new TimeCommand(),
            new DateCommand(),
            new LsCommand(),
            new CdCommand()
	    };
        String path = "C:\\Users\\" + System.getProperty("user.name");
	    while (true){
	        System.out.print("-->");
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            String[] cmd = line.split(" ");
            boolean done = false;
            for (Command command: cmds) {
                if (cmd[0].equals(command.getName())){
                    path = command.execute(cmd, path);
                    done = true;
                }
            }
            if (!done) System.out.println("Команда не найдена");
        }
    }
}

interface Command {
    String getName();
    String execute(String[] args, String path);
}

class QuitCommand implements Command {

    @Override
    public String getName(){
        return "quit";
    }

    @Override
    public String execute(String[] args, String path){
        System.exit(0);
        return path;
    }
}

class TimeCommand implements Command {

    @Override
    public String getName(){
        return "time";
    }

    @Override
    public String execute(String[] args, String path){
        System.out.println(LocalTime.now().toString());
        return path;
    }
}

class DateCommand implements Command {

    @Override
    public String getName(){
        return "date";
    }

    @Override
    public String  execute(String[] args, String path){
        System.out.println(LocalDate.now().toString());
        return path;
    }
}

class LsCommand implements Command {

    @Override
    public String getName(){
        return "ls";
    }

    @Override
    public String execute(String[] args, String path){
        File dir = new File(path);
        for (File item : dir.listFiles()) {
            if (item.isDirectory()) {
                System.out.print(item.getName() + "   ");
            }
        }
        System.out.println();
        return path;
    }
}

class CdCommand implements Command {

    @Override
    public String getName(){
        return "cd";
    }

    @Override
    public String execute(String[] args, String path){
        String tempPath;
        if (args[1] == ".."){
            String[] arrPath = path.split(path);
            int pos = 0;
            for (int i = 0; i < arrPath.length; i++){
                if (arrPath[i].equals("\\")) pos = i;
            }
            tempPath = path.substring(0, pos);
        }
        else tempPath = new String(path + "\\"+ args[1]);
        File dir = new File(tempPath);
        if (dir.isDirectory()) {
            path = tempPath;
            return path;
        }
        tempPath = args[1];
        dir = new File(tempPath);
        if (dir.isDirectory()){
            path = tempPath;
            return path;
        }
        else System.out.println("Каталог не найден");
        return path;
    }
}
