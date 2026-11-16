package com.noor.learn.extra;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author noor.shaik
 * @since 13-11-2026
 */
public class SequenceArrays {

    public static void main(String[] args) {

        String input = "5 6 7 2 3 4 10 11 15 a 20 21";

        String[] values = input.trim().split(Pattern.quote(" "));

        List<Integer> sequence = new ArrayList<>();

        List<List<Integer>> sequences = new ArrayList<>();

        for( String value : values) {

            try {
                int current = Integer.parseInt(value);

                if (sequence.isEmpty()) {
                    sequence.add(current);
                    continue;
                }

                int previous = sequence.get(sequence.size() - 1);

                if ((long) current == (long) previous + 1) {
                    sequence.add(current);
                } else {

                    if (sequence.size() > 1) {
                        sequences.add(new ArrayList<>(sequence));
                    }

                    sequence.clear();
                    sequence.add(current);
                }

            } catch (NumberFormatException e) {

                System.out.println("Invalid integer: " + value);

                if (sequence.size() > 1) {
                    sequences.add(new ArrayList<>(sequence));
                }

                sequence.clear();
            }
        }
            if (sequence.size() > 1) {
                sequences.add(new ArrayList<>(sequence));
            }
        sequences.stream().forEach(System.out::println);
    }
}
