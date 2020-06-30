package ru.sbrf.jc.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Command[] commands = {
                new Exit(),
                new Show(),
                new Add()
        };
        System.out.println("Введите 'show' чтобы вывести список\n'add название_продукта' чтобы добавить его в список\n'exit' для выхода из программы");
        while (true){
            System.out.print("-->");
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            String[] cmd = line.split(" ");
            boolean done = false;
            for (Command command: commands) {
                if (cmd[0].equals(command.getName())){
                    list  = command.execute(list, cmd);
                    done = true;
                }
            }
            if (!done) System.out.println("Команда не найдена");
        }
    }
}

interface Command {
    String getName();
    ArrayList<String> execute(ArrayList<String> list, String[] obj);
}

class Exit implements Command{

    public String getName(){
        return "exit";
    }

    public ArrayList<String> execute (ArrayList<String> list, String[] obj){
        System.exit(0);
        return list;
    }
}


class Show implements Command {

    public String getName(){
        return "show";
    }

    public ArrayList<String> execute (ArrayList<String> list, String[] obj){
        System.out.println("Ваш список: ");
        for (String elem: list) {
            System.out.println(elem);
        }
        return list;
    }
}

class Add implements Command {

    public String getName(){
        return "add";
    }

    public ArrayList<String> execute (ArrayList<String> list, String[] obj){
        for (int i = 1; i < obj.length; i++){
            list.add(obj[i]);
        }
        return list;
    }
}


