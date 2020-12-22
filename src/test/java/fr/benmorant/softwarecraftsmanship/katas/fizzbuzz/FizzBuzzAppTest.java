package fr.benmorant.softwarecraftsmanship.katas.fizzbuzz;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FizzBuzzAppTest {


  @Test
  public void should_return_1_when_fizzBuzzing_1() {

    // Given
    FizzBuzzApp fizzBuzzApp = new FizzBuzzApp();
    int input = 1;
    String expected = "1";

    // When
    String actual = fizzBuzzApp.fizzBuzz(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_2_when_fizzBuzzing_2() {

    // Given
    FizzBuzzApp fizzBuzzApp = new FizzBuzzApp();
    int input = 2;
    String expected = "2";

    // When
    String actual = fizzBuzzApp.fizzBuzz(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_Fizz_when_fizzBuzzing_3() {

    // Given
    FizzBuzzApp fizzBuzzApp = new FizzBuzzApp();
    int input = 3;
    String expected = "Fizz";

    // When
    String actual = fizzBuzzApp.fizzBuzz(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_Fizz_when_fizzBuzzing_6() {

    // Given
    FizzBuzzApp fizzBuzzApp = new FizzBuzzApp();
    int input = 6;
    String expected = "Fizz";

    // When
    String actual = fizzBuzzApp.fizzBuzz(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_Buzz_when_fizzBuzzing_5() {

    // Given
    FizzBuzzApp fizzBuzzApp = new FizzBuzzApp();
    int input = 5;
    String expected = "Buzz";

    // When
    String actual = fizzBuzzApp.fizzBuzz(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_Buzz_when_fizzBuzzing_10() {

    // Given
    FizzBuzzApp fizzBuzzApp = new FizzBuzzApp();
    int input = 10;
    String expected = "Buzz";

    // When
    String actual = fizzBuzzApp.fizzBuzz(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_FizzBuzz_when_fizzBuzzing_15() {

    // Given
    FizzBuzzApp fizzBuzzApp = new FizzBuzzApp();
    int input = 15;
    String expected = "FizzBuzz";

    // When
    String actual = fizzBuzzApp.fizzBuzz(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void should_return_FizzBuzz_when_fizzBuzzing_30() {

    // Given
    FizzBuzzApp fizzBuzzApp = new FizzBuzzApp();
    int input = 30;
    String expected = "FizzBuzz";

    // When
    String actual = fizzBuzzApp.fizzBuzz(input);

    // Then
    assertThat(actual).isEqualTo(expected);
  }
}
