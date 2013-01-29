/*
 * Based on http://en.wikipedia.org/wiki/Factory_method_pattern
 */
package FactoryMethod.Wikipedia;

/**
 *
 * @author joshua
 */
class Complex {

    public static Complex fromCartesianFactory(double real, double imaginary) {
        return new Complex(real, imaginary);
    }

    public static Complex fromPolarFactory(double modulus, double angle) {
        return new Complex(modulus * Math.cos(angle), modulus * Math.sin(angle));
    }

    private Complex(double a, double b) {
        //...
    }
}