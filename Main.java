public class Main {
    public static void main(String[] args) {
        ProgramSystem sys = new ProgramSystem();

        Button sb1 = new StartButton();
        Button pb1 = new PauseButton();
        
        // this will cause error because instance still refers to parent class
        // sb1.starting(sys);
        // pb1.pausing(sys);
        
        // downcasting
        StartButton sb2 = (StartButton) sb1;
        PauseButton pb2 = (PauseButton) pb1;

        // accessing downcasted object methods, shall work fine :)
        sb2.starting(sys);
        pb2.pausing(sys);

        System.out.println("=".repeat(10));

        // understanding instanceof
        System.out.println(pb1 instanceof Button);
        System.out.println(pb1 instanceof PauseButton);
        System.out.println(pb1 instanceof Pausable);
        System.out.println(pb1 instanceof Object);
        System.out.println(pb1 instanceof StartButton);

        System.out.println("=".repeat(10));
        
        System.out.println(pb2 instanceof Button);
        System.out.println(pb2 instanceof PauseButton);
        System.out.println(pb2 instanceof Pausable);
        System.out.println(pb2 instanceof Object);
        // will cause error as pb2 is not directly instantiatied to Button
        // System.out.println(pb2 instanceof StartButton);

        System.out.println("=".repeat(10));

        // parameter polymorphism
        getBehavior(new StartButton());
        getBehavior(new PauseButton());
    }

    public static void getBehavior(Button btn) {
        btn.behavior();
    }
}
