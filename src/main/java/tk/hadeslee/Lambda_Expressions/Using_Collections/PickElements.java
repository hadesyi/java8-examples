package tk.hadeslee.Lambda_Expressions.Using_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: java8-examples
 * FileName: PickElements
 * Date: 2015-10-25
 * Time: 오전 12:40
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickElements {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");


        final List<String> startsWithN = new ArrayList<String>();
        for (String name : friends) {
            startsWithN.add(name);
        }

        final List<String> startsWithN2 =
                friends.stream()
                        .filter(name -> name.startsWith("N"))
                        .collect(Collectors.toList());

        System.out.println(String.format("Found %d names", startsWithN2.size()));
    }
}
