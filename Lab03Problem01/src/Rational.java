import javax.management.DynamicMBean;

public class Rational {
    //State
    private int numerator;
    private int denominator;

    //Behavior
    Rational(String numerator, String denominator) {
        if (Integer.parseInt(denominator) == 0) {
            throw new IllegalArgumentException("The denominator can not be equal to zero.");
        }

        this.numerator = Integer.parseInt(numerator);
        this.denominator = Integer.parseInt(denominator);

        //TODO:  simplify
        //TODO: find GCD and divide numerator and denominator
    }

    Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("The denominator can not be equal to zero.");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    int compareTo(Rational other) {
        int a = numerator * other.denominator;
        int b = denominator * other.denominator;

        return a - b;
    }

    static Rational parseRational(String input) {
        String[] parts = input.split("/");

        if (parts.length == 0 || parts.length > 2) {
            throw new IllegalArgumentException("Incorrect rational: " + input);
        }

        try {
            if (parts.length == 1) {
                int numerator = Integer.parseInt(input);

                return new Rational(numerator, numerator);
            } else {
                int numerator;
                int denominator;

                numerator = Integer.parseInt(parts[0]);
                denominator = Integer.parseInt(parts[1]);

                return new Rational(numerator, denominator);
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Incorrect rational: " + input);
        }
    }

    Rational add(Rational another) {
        return new Rational(
                numerator * another.denominator + denominator * another.numerator,
                denominator * denominator
        );
    }

    Rational subtract(Rational another) {
        return new Rational(
                numerator * another.denominator - denominator * another.numerator,
                denominator * denominator
        );
    }

    Rational multiply(Rational another) {
        return new Rational(
                numerator * another.numerator,
                denominator * another.denominator
        );
    }

    Rational divide(Rational another) {
        return new Rational(
                numerator * another.denominator,
                denominator * another.numerator
        );
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
