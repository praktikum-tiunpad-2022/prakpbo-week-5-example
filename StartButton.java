public class StartButton extends Button implements Startable {
    public StartButton() {
        super();
    }

    @Override
    public void starting(ProgramSystem sys) {
        sys.start();
    }

    @Override
    public void behavior() {
        System.out.println("This button will start the system");
    }
}
