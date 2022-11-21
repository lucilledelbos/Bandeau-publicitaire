import bandeau.Bandeau;
package exemple;

/**
 *
 * @author ldelbos
 */
public class Clignotant extends Effet {
    private int tempsSleep = 100;

    public void setTempsSleep(int tempsSleep) {
        this.tempsSleep = tempsSleep;
    }

    public void animationSurBandeau(Bandeau monBandeau) {
        String message = monBandeau.getMessage();
        monBandeau.sleep(tempsSleep);
        monBandeau.setMessage("");
        monBandeau.sleep(tempsSleep);
        monBandeau.setMessage(message);
    }

}
