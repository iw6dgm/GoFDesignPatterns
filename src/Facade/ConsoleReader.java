/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joshua
 */
public class ConsoleReader {

    public static final boolean SECURE_MODE_ON = true;
    public static final boolean SECURE_MODE_OFF = false;
    BufferedReader br;
    boolean secureMode;

    public ConsoleReader() {
        this(SECURE_MODE_ON);
    }

    public ConsoleReader(boolean secMod) {
        br = new BufferedReader(new InputStreamReader(System.in));
        secureMode = secMod;
    }

    public String readString() {
        try {
            return br.readLine();
        } catch (Exception e) {
            if (secureMode) {
                throw new ConsoleReaderException(e);
            }
            return "";
        }
    }

    public Integer readInteger() {
        Integer theInteger;
        try {
            theInteger = new Integer(br.readLine());
        } catch (IOException | NumberFormatException e) {
            if (secureMode) {
                throw new ConsoleReaderException(e);
            }
            theInteger = new Integer(0);
        }
        return theInteger;
    }

    public Double readDouble() {
        Double theDouble;
        try {
            theDouble = new Double(br.readLine());
        } catch (IOException | NumberFormatException e) {
            if (secureMode) {
                throw new ConsoleReaderException(e);
            }
            theDouble = new Double(0);
        }
        return theDouble;
    }
}
