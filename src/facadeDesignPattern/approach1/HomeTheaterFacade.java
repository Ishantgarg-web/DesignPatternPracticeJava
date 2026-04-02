package facadeDesignPattern.approach1;

public class HomeTheaterFacade {
    Amplifier amp;
    PopCornPopper popper;
    Lights lights;
    public HomeTheaterFacade(Amplifier amp, PopCornPopper popper, Lights lights) {
        this.amp = amp;
        this.popper = popper;
        this.lights = lights;
    }

    public void watchMovie() {
        System.out.print("Ready to watch movie...");
        amp.on();
        popper.pop();
        lights.on();
    }

    public void endMovie() {
        System.out.print("Turning off movie...");
        amp.off();
        popper.off();
        lights.off();
    }
}
