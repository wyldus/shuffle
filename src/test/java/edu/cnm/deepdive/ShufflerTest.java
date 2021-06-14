package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import org.junit.jupiter.api.Test;

class ShufflerTest {

  @Test
  void shuffle() {
    int[] input = generate(1_000_000);
    int[] testCopy = input.clone();
    Shuffler shuffler = new Shuffler(new Random());
    shuffler.shuffle(input);
    assertFalse(Arrays.equals(input, testCopy));
    buildSet(testCopy);
    Set<Integer> shuffled = new HashSet<>();

   }

  private Set<Integer> buildSet(int[] testCopy) {
    Set<Integer> original = new HashSet<>();
    for (int value : testCopy) {
      original.add(value);
    }
    return original
  }

  private int[] generate(int size) {
    int[] content = new int[size];
    for (int i = 0; i < content.length; i++) {
      content[i] = i;
    }
    return content;
  }


}