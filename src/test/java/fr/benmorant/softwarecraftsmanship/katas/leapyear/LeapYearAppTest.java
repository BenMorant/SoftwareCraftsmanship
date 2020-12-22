package fr.benmorant.softwarecraftsmanship.katas.leapyear;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LeapYearAppTest {

  @Test
  public void should_return_false_for_year_2021() {
    // Given
    LeapYearApp leapYearApp = new LeapYearApp();
    int input = 2021;
    boolean expected = false;

    // When
    boolean actual = leapYearApp.isLeapyear(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_false_for_year_2001_as_a_typical_common_year() {
    // Given
    LeapYearApp leapYearApp = new LeapYearApp();
    int input = 2001;
    boolean expected = false;

    // When
    boolean actual = leapYearApp.isLeapyear(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_true_for_year_1996_as_a_typical_leap_year() {
    // Given
    LeapYearApp leapYearApp = new LeapYearApp();
    int input = 1996;
    boolean expected = true;

    // When
    boolean actual = leapYearApp.isLeapyear(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_true_for_year_1992_as_a_typical_leap_year() {
    // Given
    LeapYearApp leapYearApp = new LeapYearApp();
    int input = 1992;
    boolean expected = true;

    // When
    boolean actual = leapYearApp.isLeapyear(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_false_for_year_1900_as_an_atypical_common_year() {
    // Given
    LeapYearApp leapYearApp = new LeapYearApp();
    int input = 1900;
    boolean expected = false;

    // When
    boolean actual = leapYearApp.isLeapyear(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_false_for_year_1800_as_an_atypical_common_year() {
    // Given
    LeapYearApp leapYearApp = new LeapYearApp();
    int input = 1800;
    boolean expected = false;

    // When
    boolean actual = leapYearApp.isLeapyear(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_true_for_year_2000_as_an_atypical_leap_year() {
    // Given
    LeapYearApp leapYearApp = new LeapYearApp();
    int input = 2000;
    boolean expected = true;

    // When
    boolean actual = leapYearApp.isLeapyear(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_true_for_year_1600_as_an_atypical_leap_year() {
    // Given
    LeapYearApp leapYearApp = new LeapYearApp();
    int input = 1600;
    boolean expected = true;

    // When
    boolean actual = leapYearApp.isLeapyear(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }
}
