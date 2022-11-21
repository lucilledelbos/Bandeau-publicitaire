import bandeau.Bandeau;
package exemple;


/**
 *
 * @author ldelbos
 */
public class Rotation extends Effet{
    private int nbPasBandeau = 1;


    public void setNbPasBandeau(int nbPasBandeau) {
        this.nbPasBandeau = nbPasBandeau;
    }

    public void animationSurBandeau(Bandeau monBandeau){
        for (int i = 1; i <= nbPasBandeau; i++) {
            monBandeau.setRotation(i*Math.PI / 2.0f);
            monBandeau.sleep(100);
        }
    }

}
