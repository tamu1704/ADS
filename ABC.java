public class ABC{
    public static void main(String[] args) {
        CR c=new CR();
        c.ask();
        c.run();
        student.pick();
        student.sing();
    }
}
class CR{
    void run(){
        System.out.println("I am running");
    }
    void ask(){
        System.out.println("I am asking");
    }
}
class student{
    static void pick(){
        System.out.println("I am picking");
    }
    static void sing(){
        System.out.println("I am singing");
    }
}