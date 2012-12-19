/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

import java.util.Date;

/**
 *
 * @author joshua
 */
public class FlyweightComparisonExample {

    public static void main(String[] arg) {
        EventSymbol[] eventList = new EventSymbol[1000000];
        Date tStart, tFinish;
        long prepTime, compTime;
// No-flyweight usage statistics
        System.out.println("Testing creation and comparison of "
                + "unshared EventSymbol instances");
        tStart = new Date();
        for (int i = 0; i < eventList.length; i++) {
            double r = Math.random();
            if (r < .3) {
                eventList[i] = new EventSymbol("EVENT 1");
            } else if (r < .6) {
                eventList[i] = new EventSymbol("EVENT 2");
            } else {
                eventList[i] = new EventSymbol("EVENT 3");
            }
        }
        tFinish = new Date();
        prepTime = tFinish.getTime() - tStart.getTime();
        int evn1count = 0, evn2count = 0, evn3count = 0;
        EventSymbol compEvent1 = new EventSymbol("EVENT 1");
        EventSymbol compEvent2 = new EventSymbol("EVENT 2");
        EventSymbol compEvent3 = new EventSymbol("EVENT 3");
        tStart = new Date();
        for (int i = 0; i < eventList.length; i++) {
            if (eventList[i].isEqualsTo(compEvent1)) {
                evn1count++;
            } else if (eventList[i].isEqualsTo(compEvent2)) {
                evn2count++;
            } else {
                evn3count++;
            }
        }
        tFinish = new Date();
        compTime = tFinish.getTime() - tStart.getTime();
        System.out.println("E1: " + evn1count + " E2: " + evn2count
                + " E3: " + evn3count);
        System.out.println(
                "Filling time: " + prepTime);
        System.out.println("Computing time: " + compTime);
        System.out.println(
                "Total time: " + (prepTime + compTime));
// Flyweight usage statistics
        System.out.println("Testing creation and comparison of shared"
                + "EventSymbol instances");
        tStart = new Date();
        for (int i = 0; i < eventList.length; i++) {
            double r = Math.random();
            if (r < .3) {
                eventList[i] = EventSymbolFactory.newEventSymbol("EVENT 1");
            } else if (r < .6) {
                eventList[i] = EventSymbolFactory.newEventSymbol("EVENT 2");
            } else {
                eventList[i] = EventSymbolFactory.newEventSymbol("EVENT 3");
            }
        }
        tFinish = new Date();
        prepTime = tFinish.getTime() - tStart.getTime();
        evn1count = 0;
        evn2count = 0;
        evn3count = 0;
        tStart = new Date();
        compEvent1 = EventSymbolFactory.newEventSymbol("EVENT 1");
        compEvent2 = EventSymbolFactory.newEventSymbol("EVENT 2");
        compEvent3 = EventSymbolFactory.newEventSymbol("EVENT 3");
        for (int i = 0; i < eventList.length; i++) {
            if (eventList[i] == compEvent1) {
                evn1count++;
            } else if (eventList[i] == compEvent2) {
                evn2count++;
            } else {
                evn3count++;
            }
        }
        tFinish = new Date();
        compTime = tFinish.getTime() - tStart.getTime();
        System.out.println("E1: " + evn1count + " E2: " + evn2count
                + " E3: " + evn3count);
        System.out.println(
                "Filling time: " + prepTime);
        System.out.println("Computing time: " + compTime);
        System.out.println("Total time: " + (prepTime + compTime));
    }
}
