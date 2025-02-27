package org.sigcse.sigcse2025.threeintsincreasingstrict;

import edu.illinois.cs.cs125.questioner.lib.Correct;

/*
 * Create a public class named `Question` with a single class method
 * named `areIncreasingStrict`.
 * Your method should accept three `int` arguments and return whether
 * the first is strictly greater than the second and the second is
 * strictly greater than the third.
 */

@Correct(
    name = "Three Ints Increasing Strict",
    author = "challen@illinois.edu",
    version = "2024.7.0")
public class Question {
  public static boolean areIncreasingStrict(int one, int two, int three) {
    return two > one && three > two;
  }
}
