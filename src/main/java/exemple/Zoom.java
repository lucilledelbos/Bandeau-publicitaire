import bandeau.Bandeau;
package exemple;

/**
 *
 * @author ldelbos
 */
public class Zoom extends Effet{
    private int multiplicateur = 50;

    public void setMultiplicateur(int multiplicateur) {
        this.multiplicateur = multiplicateur;
    }

    @Override
    public void animationSurBandeau(Bandeau monBandeau){
        Font font = monBandeau.getFont();
        for (int i = 5; i <= multiplicateur; i+=5) {
            monBandeau.setFont(new Font(font.getName(), font.getStyle(), font.getSize() + i));
            monBandeau.sleep(100);
        }
    }

}
