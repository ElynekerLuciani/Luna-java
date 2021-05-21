package rsbuttom;

/**
 *
 * @author Rojeru San
 */
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 * @author Rojeru San
 */
public class RSButtonMetro extends JButton implements MouseListener, MouseMotionListener {

    /**
     * Color para el fondo del boton
     */
    private Color colorNormal = new Color(240, 240, 240);
    private Color colorPressed = new Color(204, 204, 204);
    //private Color colorHover = new Color(38, 86, 186);
    private Color colorHover = new Color(0, 153, 255);

    private Border bordeMoved = javax.swing.BorderFactory.createMatteBorder(0, 20, 0, 20, new java.awt.Color(255, 255, 255));
    /**
     * Color para el texto
     */
    private Color colorTextNormal = new Color(51, 51, 51);
    private Color colorTextPressed = new Color(51, 51, 51);
    private Color colorTextHover = new Color(255, 255, 255);

    private Font f = new Font("SansSerif", Font.BOLD, 14);

    /**
     * Constructor de clase
     */
    @SuppressWarnings("LeakingThisInConstructor")
    public RSButtonMetro() {
        this.setFont(f);
        this.setPreferredSize(new Dimension(150, 35));
        this.setSize(new Dimension(150, 35));
        this.setBorder(new EmptyBorder(0, 20, 0, 20));
//        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setBackground(this.colorNormal);
        this.setForeground(this.colorTextNormal);
        this.setOpaque(true);
        this.setVisible(true);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        //this.setIconTextGap(40);
        // this.setLocation(30, 30);
        // this.setMargin(new Insets(30, 10, 10, 10));

    }

    /**
     * se pinta la imagen con dimensiones de ancho y alto iguales al alto del
     * jbutton
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void mouseClicked(MouseEvent e) {
    }

    /**
     * Cuando se presiona el boton se cambian los colores de fondo y de texto
     */
    public void mousePressed(MouseEvent e) {
        this.setForeground(this.colorTextPressed);
        this.setBackground(this.colorPressed);
    }

    /**
     * Cuando se leventa el mouse del jbutton se retoman los colores originales
     */
    public void mouseReleased(MouseEvent e) {
        // this.setBackground(this.colorNormal);
        // this.setForeground(this.colorTextNormal);
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
        //this.setBorder(null);
        this.setBackground(this.colorNormal);
        this.setForeground(this.colorTextNormal);
    }

    public Color getColorPressed() {
        return colorPressed;
    }

    public void setColorPressed(Color colorPressed) {
        this.colorPressed = colorPressed;
    }

    public Color getColorTextPressed() {
        return colorTextPressed;
    }

    public void setColorTextPressed(Color colorTextPressed) {
        this.colorTextPressed = colorTextPressed;
    }

    public Color getColorHover() {
        return colorHover;
    }

    public void setColorHover(Color colorHover) {
        this.colorHover = colorHover;
    }

    public Color getColorTextHover() {
        return colorTextHover;
    }

    public void setColorTextHover(Color colorTextHover) {
        this.colorTextHover = colorTextHover;
    }

    public Color getColorNormal() {
        return colorNormal;
    }

    public void setColorNormal(Color colorNormal) {
        this.setBackground(colorNormal);
        this.colorNormal = colorNormal;
    }

    public Color getColorTextNormal() {
        return colorTextNormal;
    }

    public void setColorTextNormal(Color colorTextNormal) {
        this.setForeground(colorTextNormal);
        this.colorTextNormal = colorTextNormal;
    }

    public Border getColorBorde() {
        return bordeMoved;
    }

    public void setColorBorde(Border bordeMoved) {
        // this.bordeMoved = bordeMoved;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        this.setForeground(this.colorTextHover);
        this.setBackground(this.colorHover);

        // this.setBorder(bordeMoved);
    }
}
