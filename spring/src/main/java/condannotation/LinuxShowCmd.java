package condannotation;

public class LinuxShowCmd implements ShowCmd{
    @Override
    public String showCmd() {
        return "ls";
    }
}
