public class SlantedRectangleTest {

    // Classe Rectangle
    static class Rectangle {
        protected double x, y; // Coordonnées du coin superieur gauche
        protected double largeur, hauteur; // Largeur et hauteur

        public Rectangle(double x, double y, double largeur, double hauteur) {
            this.x = x;
            this.y = y;
            this.largeur = largeur;
            this.hauteur = hauteur;
        }

        public void translate(double dx, double dy) {
            this.x += dx;
            this.y += dy;
        }

        @Override
        public String toString() {
            return "Rectangle[x=" + x + ", y=" + y + ", largeur =" + largeur + ", hauteur =" + hauteur + "]";
        }
    }

    // Classe dérivée SlantedRectangle
    static class SlantedRectangle extends Rectangle {
        private double angle; // en degrés

        public SlantedRectangle(double x, double y, double largeur, double hauteur, double angle) {
            super(x, y, largeur, hauteur);
            this.angle = angle % 360;
        }

        public void rotate(double deltaAngle) {
            this.angle = (this.angle + deltaAngle) % 360;
        }

        public double getAngle() {
            return angle;
        }

        public void setAngle(double angle) {
            this.angle = angle % 360;
        }

        @Override
        public String toString() {
            return "SlantedRectangle[x=" + x + ", y=" + y + ", largeur =" + largeur + ", hauteur=" + hauteur + ", angle=" + angle + "°]";
        }
    }

    // Méthode principale pour tester
    public static void main(String[] args) {
        SlantedRectangle sr = new SlantedRectangle(10, 20, 30, 40, 15);
        System.out.println("Avant translation : " + sr);

        sr.translate(5, -10);
        System.out.println("Après translation : " + sr);

        sr.rotate(45);
        System.out.println("Après rotation : " + sr);
    }
}
