import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.PriorityQueue;
public class ReadAddresses {


    public static PriorityQueue<DeliveryLocationsIndicater> Reading(String readingFile) throws IOException {
        PriorityQueue<DeliveryLocationsIndicater> pQueue = new PriorityQueue<DeliveryLocationsIndicater>();

        File file = new File(readingFile);


        Scanner input = new Scanner(file);


        while (input.hasNextLine()) {

            String line = input.nextLine();
            String[] temp = line.split(" ");

            int houesNumber = Integer.parseInt(temp[0]);
            Compass facing;
            if (temp[1].equals("South")) {
                facing = Compass.South;
            } else {
                facing = Compass.East;
            }
            int StreetNum = Integer.parseInt(temp[2]);


            DeliveryLocationsIndicater location = new DeliveryLocationsIndicater(houesNumber, facing, StreetNum);


            pQueue.add(location);




        }

        input.close();
        System.out.println(pQueue);

        return pQueue;
    }
}
