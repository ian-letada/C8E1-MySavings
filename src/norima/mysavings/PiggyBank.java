package norima.mysavings;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class PiggyBank {
    ArrayList<String> coins = new ArrayList<>();
    private static final String NICKEL = "nickel";
    private static final BigDecimal NICKEL_VALUE = BigDecimal.valueOf(0.05);
    private static final String PENNY = "penny";
    private static final BigDecimal PENNY_VALUE = BigDecimal.valueOf(0.01);
    private static final String DIME = "dime";
    private static final BigDecimal DIME_VALUE = BigDecimal.valueOf(0.10);
    private static final String QUARTER = "quarter";
    private static final BigDecimal QUARTER_VALUE = BigDecimal.valueOf(0.25);

    public void addNickel() {
        coins.add(NICKEL);
        System.out.println("Added a nickel to the piggy bank.");
    }

    public void removeNickel() {

        if (coins.remove(NICKEL)) {
            System.out.println("Removed a nickel.");
        } else {
            System.out.println("No nickels present. None removed.");
        }
    }

    public void addPenny() {
        coins.add(PENNY);
        System.out.println("Added a penny to the piggy bank.");
    }

    public void removePenny() {
        if (coins.remove(PENNY)) {
            System.out.println("Removed a penny.");
        } else {
            System.out.println("No penny present. None removed.");
        }
    }

    public void addDime() {
        coins.add(DIME);
        System.out.println("Added a dime to the piggy bank.");
    }

    public void removeDime() {
        if (coins.remove(DIME)) {
            System.out.println("Removed a dime.");
        } else {
            System.out.println("No dime present. None removed.");
        }
    }

    public void addQuarter() {
        coins.add(QUARTER);
        System.out.println("Added a quarter to the piggy bank.");
    }

    public void removeQuarter() {
        if (coins.remove(QUARTER)) {
            System.out.println("Removed a quarter.");
        } else {
            System.out.println("No quarter present. None removed");
        }
    }

    public BigDecimal getSavings() {
        BigDecimal savings = new BigDecimal(0);
        Map<String, Long> map = coins.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (entry.getKey().equals(NICKEL)) {
                savings = savings.add(NICKEL_VALUE.multiply(BigDecimal.valueOf(entry.getValue())));
            }
            if (entry.getKey().equals(PENNY)) {
                savings = savings.add(PENNY_VALUE.multiply(BigDecimal.valueOf(entry.getValue())));
            }
            if (entry.getKey().equals(DIME)) {
                savings = savings.add(DIME_VALUE.multiply(BigDecimal.valueOf(entry.getValue())));
            }
            if (entry.getKey().equals(QUARTER)) {
                savings = savings.add(QUARTER_VALUE.multiply(BigDecimal.valueOf(entry.getValue())));
            }
        }

        return savings;
    }

}
