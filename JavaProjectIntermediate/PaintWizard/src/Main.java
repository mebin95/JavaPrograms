import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Paint p = new Paint("CheapoMax", 19.99, 10, 20);
        Paint p1 = new Paint("AverageJoes", 17.99, 11, 15);
        Paint p2 = new Paint("DuluxourousPaints", 25, 20, 10);

        ArrayList<Paint> paints= new ArrayList<Paint>();

        paints.add(p);
        paints.add(p1);
        paints.add(p2);

        PaintWizard pw = new PaintWizard(paints);

        double roomSize =730;
        pw.leastPaintWasted(paints, roomSize);
        pw.cheapestPaint(paints, roomSize);

    }
}
