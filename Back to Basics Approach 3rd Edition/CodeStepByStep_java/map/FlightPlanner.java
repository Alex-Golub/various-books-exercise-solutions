package CodeStepByStep.java.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/FlightPlanner
 *
 * @author Alex Golub
 * @since 02-May-21, 11:43 AM
 */
class FlightPlanner {
  private static final int ORIGIN = 0;
  private static final int DESTINATION = 1;
  private static final Scanner console = new Scanner(System.in);
  
  public static void main(String[] args) throws FileNotFoundException {
    String fileName = welcomeMsg();
    Map<String, Set<String>> flights = buildFlights(fileName);
    printAllCities(flights.keySet());
    
    List<String> route = new ArrayList<>();
    
    String origin = selectOrigin(flights);
    route.add(origin);
    String prevDest = origin;
    
    while (true) {
      String nextDest = nextDestination(prevDest, flights.get(prevDest));
      if (nextDest.equals(origin)) {
        route.add(nextDest);
        break;
      }
      
      if (!nextDest.equals("")) {
        route.add(nextDest);
        prevDest = nextDest;
      }
    }
    
    System.out.println("The route you've chosen is:");
    System.out.println(String.join(" -> ", route));
  }
  
  private static void printAllCities(Set<String> cities) {
    System.out.println("\nHere's a list of all the cities in our database:");
    cities.forEach(c -> System.out.println(" " + c));
    System.out.println("Let's plan a round-trip route!");
  }
  
  private static String nextDestination(String origin, Set<String> destinations) {
    System.out.println("From " + origin + " you can fly directly to:");
    destinations.forEach(d -> System.out.println(" " + d));
    
    System.out.print("Where do you want to go from " + origin + "? ");
    String dest = console.nextLine();
    if (!destinations.contains(dest)) {
      System.out.println("You can't get to that city by a direct flight.");
      dest = ""; // stay in place
    }
    
    return dest;
  }
  
  private static String selectOrigin(Map<String, Set<String>> flights) {
    String origin;
    do {
      System.out.print("Enter the starting city: ");
      origin = console.nextLine();
      if (flights.containsKey(origin)) {
        break;
      }
      
      System.out.println("  Entered departure city is not from the list, try again.");
    } while (true);
    
    return origin;
  }
  
  private static String welcomeMsg() {
    System.out.println("Welcome to Flight Planner!");
    System.out.print("Input file name? ");
    return console.nextLine();
  }
  
  private static Map<String, Set<String>> buildFlights(String fileName)
    throws FileNotFoundException {
    Scanner fileReader = new Scanner(new File(fileName));
    Map<String, Set<String>> map = new LinkedHashMap<>();
    
    while (fileReader.hasNextLine()) {
      String flight = fileReader.nextLine();
      
      if (!flight.equals("")) { // ignore blank lines
        String[] split = flight.split(" -> "); // split by Origin and Destination
        
        map.compute(split[ORIGIN], (k, v) -> {
          if (v == null) {
            v = new LinkedHashSet<>();
          }
          v.add(split[DESTINATION]);
          return v;
        });
  
        map.compute(split[DESTINATION], (k, v) -> {
          if (v == null) {
            v = new LinkedHashSet<>();
          }
          v.add(split[ORIGIN]);
          return v;
        });
      }
    }
    
    return map;
  }
}
