package org.sigcse.sigcse2025.issecretnumber;

import edu.illinois.cs.cs125.jenisol.core.FixedParameters;
import edu.illinois.cs.cs125.questioner.lib.Correct;
import java.util.Arrays;
import java.util.List;

/*
 * Create a public class named `Question` with a single static method `isSecretNumber`.
 * Return whether the passed `int` is the secret number.
 * (Ssh: it's 88 or 888!)
 */

@Correct(name = "Is Secret Number", author = "challen@illinois.edu", version = "2024.7.0")
public class Question {
  @FixedParameters private static final List<Integer> FIXED = Arrays.asList(88, 888);

  public static boolean isSecretNumber(int value) {
    return value == 88 || value == 888;
  }
}
