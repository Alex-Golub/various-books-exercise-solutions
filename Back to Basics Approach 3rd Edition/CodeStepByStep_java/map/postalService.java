package CodeStepByStep.java.map;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/postalService
 *
 * Your job is to build and return a new hash map where the keys are city names,
 * and values are strings showing the last name (surname) of every customer
 * whose ZIP code is in that city.
 *
 * For any name, regardless of how many words it contains,
 * the last word in that name is considered to be the customer's last name / surname.
 *
 * @author Alex Golub
 * @since 01-May-21, 6:07 PM
 */
class postalService {
  public static HashMap<String, String> postalService(Map<String, Integer> nameZip,
                                                  Map<Integer, String> zipCity) {
    HashMap<String, String> citySure = new HashMap<>();
    
    for (String name : nameZip.keySet()) {
      Integer zip = nameZip.get(name);
      
      if (zipCity.containsKey(zip)) {
        String city = zipCity.get(zip);
        String[] fullName = name.split(" ");
        String sureName = fullName[fullName.length - 1];
        citySure.compute(city, (k, v) -> v == null ? sureName : v + " and " + sureName);
      }
    }
    
    return citySure;
  }
}
