package facadeDesignPattern;

/**
 * Problem Statement: Let's say you want to watch a Movie, But you want to do some things before that - Popcorn machine on, prepare popcorn,
 * Light dim, Music player on, and set some sound and so on.
 *
 * This is very tedious process - see how many classes we need - MusicPlayer, Popcorn, Light and so on.
 *
 * What does facade can do for us?
 * It simplifies the complexity of the multiple interfaces to a simple interface, and also if clients want to use/see subsystem classes -
 * they can easily access them.
 * Like in this case - It will produce a simple interface named HomeTheaterFacade - which have mnethods like watchMovie(), endMovie(),
 * startRadio(), and so on.
 *
 */
public class Main {
}
