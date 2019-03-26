import javax.swing.*;

public class GUI extends JFrame {

    GUI(TruckRoute truck){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Truck Simulation");
        add(new GridSimulation(truck));

        setSize(700, 700);
        setVisible(true);
    }

    }

