package ru.sbrf.jc.demo;


class User {
    String name;
    int year;

    public User (String name, int year){
        this.name = name;
        this.year = year;
    }

}

public class Main {

    public static void main(String[] args) {
        LList LL = new LList();
        LL.add(new User("Pavel", 1953));
        LL.add(new User("Roman", 1999));
        LL.add(new User("ne Roman", 1967));
        LL.add(new User("Maria", 1976));
        LL.add(new User("Roflan", 2008));
        System.out.println(LL.size());
        User u = (User) LL.get(3);
        System.out.println(u.name);
    }
}
