import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PaintWizard {

    ArrayList<Paint> paintList;

    public PaintWizard(ArrayList<Paint> paintList) {
        this.paintList = paintList;
    }

    public ArrayList<Paint> getPaintList() {
        return paintList;
    }

    public void setPaintList(ArrayList<Paint> paintList) {
        this.paintList = paintList;
    }

    public void leastPaintWasted(ArrayList<Paint> paintList, double roomSize) {

        Paint least = new Paint("",0,0,0);

        double leastWasted = paintList.get(0).getCoverage();

        for(Paint p : paintList) {

            double potsRequired = roomSize / p.getCoverage();

            double waste = (Math.ceil(potsRequired) * p.getCoverage()) - (potsRequired * p.getCoverage());

            if(leastWasted > waste) {
                leastWasted = waste;
                least = p;

            } else if(leastWasted == waste) {
                if (p.costPerLitre() < least.costPerLitre()) {
                    leastWasted = waste;
                    least = p;
                }
            }

        }
        System.out.println(least.getName() + " wastes the least amount of paint with " + leastWasted + ".");

    }


    public void cheapestPaint(ArrayList<Paint> paintList, double roomSize) {
        Paint lowest = new Paint("",0,0,0);

        double lowestCost = paintList.get(0).getCost() * Math.ceil(roomSize / paintList.get(0).getCoverage());

        for(Paint p : paintList) {

            double potsRequired = roomSize / p.getCoverage();

            double totalPots = (Math.ceil(potsRequired));

            double totalCost = totalPots * p.getCost();

            if(lowestCost > totalCost) {
                lowestCost = totalCost;
                lowest = p;
            } else if(lowestCost == totalCost){
                lowest = p;
            }

        }
        System.out.println(lowest.getName() + " costs the least with £" + lowestCost + " to paint a room of size " + roomSize + ".");

    }





}





