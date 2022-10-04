public interface Pausable {
    // interface property is implicitly static and final
    // it is a bad idea to use interface property, only use the methods
    public int z = 7;

    public void pausing(ProgramSystem sys);
}
