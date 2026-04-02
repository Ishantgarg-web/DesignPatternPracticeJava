package facadeDesignPattern.approach1;

public class TestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        PopCornPopper popCornPopper = new PopCornPopper();
        Lights lights = new Lights();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, popCornPopper, lights);
        homeTheaterFacade.watchMovie();
    }
}
