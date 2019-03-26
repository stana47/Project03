import javax.swing.*;
import java.awt.*;

public class GridSimulation extends JPanel {

    private TruckRoute t;
    public int d = 2;

    public GridSimulation(TruckRoute truck) {
        t = truck;
    }

    @Override
    public void paint(Graphics g1) {
        Graphics2D g = (Graphics2D) g1;
        drawGrid(g);
        drawTruck(g);

    }

    private void drawGrid(Graphics2D g) {
        setBackground(Color.green);

        if (getWidth() < getHeight())
            d = this.getWidth() / 18;
        else
            d = this.getHeight() / 18;
        for (int i = 0; i < 20; i++) {
            int currentXY = i * d;
            g.drawLine(currentXY, 0, currentXY, getHeight());
            g.drawLine(0, currentXY, getWidth(), currentXY);
        }
    }

    private void drawTruck(Graphics2D g) {
        RandomAddresses RandomList = new RandomAddresses();
        Color c = g.getColor();
        g.setColor(Color.RED);

        int houseDistance = d / 9;
        int bX, bY;
        if (RandomList.getStreetName().equals("East")) {

            bY = RandomAddresses.getStreetNumber() * d;
            bX = ((RandomList.getHouseNumber() / 100) * d)
                    - ((RandomList.getHouseNumber() % 100) * houseDistance);
        } else {

            bX = RandomList.getStreetNumber() * d;
            bY = ((RandomList.getHouseNumber() / 100) * d)
                    - ((RandomList.getHouseNumber() % 100) * houseDistance);
        }

        g.fillOval(bX, bY, 3, 3);
        g.setColor(c);

    }




}
