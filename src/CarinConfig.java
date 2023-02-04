package model;

import java.io.*;
import java.util.*;

public class CarinConfig {
    String result = "";
    InputStream inputStream;
    public static String user = "";
    //First line
    public static int humanDimentionM;
    public static int humanDimentionN;
    //Second line
    public static double virusSpawnRate;//decimal between 0 and 1.  This indicates the probability that a virus will be spawned in each time period.
    //Third line
    public static int initialAntibodyCredit;
    public static int antibodyPlacementCost; //no more than the initial antibody credits.
    //Forth line
    public static int initialAntibodyHealth;
    public static int initialVirusHealth;
    //Fifth line
    public static int virusAttackDamage;//decrease the health of the attacked target for each attack from the host virus.
    public static int virusAttackGain;//increase the health of the host virus for each successful attack (i.e., the target cell is not empty).
    //Sixth line
    public static int antibodyAttackDamage; //decrease the health of the attacked target for each attack from the host antibody.
    public static int antibodyKillGain; //increase the health of the host antibody whenever the attack kills the target.
    //Seventh line
    public static int antibodyMoveCost; //more than antibody health
    public static int antibodyCredit; //gained after an antibody successfully destroys a virus
    
    public String getPropValues() throws IOException {

        try {
            Properties prop = new Properties();
            String propFileName = "./model/config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            Date time = new Date(System.currentTimeMillis());

            // get the property value and print it out
            String user = prop.getProperty("user");
        
            result = "CarinConfig : HumanDimension : " + humanDimentionM + " : " + humanDimentionN + "\n" +
                                    "\tVirusSpawnRate : " + virusSpawnRate + "\n" +
                                    "\tInitialAntibodyCredit : " + initialAntibodyCredit + " AntibodyPlacementCost : " + antibodyPlacementCost + "\n" +
                                    "\tInitialAntibodyHealth : " + initialAntibodyHealth + " InitialVirusHealth : " + initialVirusHealth + "\n" + 
                                    "\tVirusAttackDamage : " + virusAttackDamage + " VirusAttackGain : " + virusAttackGain + "\n" +
                                    "\tAntibodyAttackDamage : " + antibodyAttackDamage + " AntibodyKillGain : " + antibodyKillGain + "\n" +
                                    "\tAntibodyMoveCost : " + antibodyMoveCost + " AntibodyCredit : " + antibodyCredit + "\n";
            System.out.println(result + "\nProgram Ran on " + time + " by user=" + user);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return result;
    }
}
