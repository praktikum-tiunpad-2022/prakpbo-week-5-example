public class PauseButton extends Button implements Pausable {
    public PauseButton() {
        super();
    }

    @Override
    public void pausing(ProgramSystem sys) {
        sys.pause();
        // this will trigger a warning
        System.out.println(this.z);
        // access interface property through static method
        System.out.println(Pausable.z);
    }

    @Override
    public void behavior() {
        System.out.println("This button will pause the system");
    }
}
