package org.sigcse.sigcse2025.evenoddflip;

import edu.illinois.cs.cs125.questioner.lib.Correct;

/*
 * Create a public class `EvenOddFlip`.
 * It should provide a single constructor accepting an `int`,
 * which sets the initial state of the instance.
 *
 * Provide two instance methods.
 * 1. `setValue` accepts a single `int` and updates the stored value.
 * You should `assert` that the value passed to `setValue` is even if
 * the current value is odd, and odd if the current value is even.
 * 1. `isEven` retrieves whether the current saved value is even.
 *
 * Here's an example of how your class should work:
 *
 * ```java
 * EvenOddFlip example = new EvenOddFlip(10); // Starts out even
 * System.out.println(example.isEven()); // prints "true"
 * example.setValue(7); // Switch to odd
 * System.out.println(example.isEven()); // prints "false"
 * example.setValue(5); // Fails assertion, since the instance was already odd
 * ```
 */

@Correct(
  name = "Even Odd Flip",
  author = "challen@illinois.edu",
  version = "2024.7.0")
public class EvenOddFlip {
  private boolean isEven;

  public EvenOddFlip(int setValue) {
    isEven = setValue % 2 == 0;
  }

  public void setValue(int setValue) {
    assert (!(isEven && setValue % 2 == 0));
    isEven = setValue % 2 == 0;
  }

  public boolean isEven() {
    return isEven;
  }
}
