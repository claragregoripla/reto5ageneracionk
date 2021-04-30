/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.reto5ageneracionkclaragregori;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author clara.gregori
 */
public class Principal {

    private static final String HIDEN_URL = "Cómo será dar con Nekgikis V...";
    private static final int[] NUMBERS_TO_ORDER_URL = new int[]{23, 24, 25, 18,
        19, 5, 6, 7, 20, 15, 17, 8, 10, 11, 4, 3, 12, 2, 16, 14, 9, 21, 0, 1,
        13, 22};

    public static void main(String[] args) {

        String hidenUrlNoAccents = deleteAccents(HIDEN_URL);
        String hidenUrlNoAccentsNoSpaces = deleteSpaces(hidenUrlNoAccents);
        String hidenUrlNoAccentsNoSpacesToLowerCase = hidenUrlNoAccentsNoSpaces.toLowerCase();
        String[] hidenUrlNoAccentsNoSpacesToLowerCaseToArray = hidenUrlNoAccentsNoSpacesToLowerCase.split("");
        System.out.println("And the url is " + sortUrlOption1(hidenUrlNoAccentsNoSpacesToLowerCaseToArray, NUMBERS_TO_ORDER_URL));
    }

    public static String deleteAccents(String stringToAmend) {
        stringToAmend = Normalizer.normalize(stringToAmend, Normalizer.Form.NFD);
        return stringToAmend.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    }

    public static String deleteSpaces(String stringToAmend) {
        return stringToAmend.replaceAll("\\s+", "");
    }

    public static String sortUrlOption1(String[] urlToSort, int[] orderToSort) {
        String[] urlToStringArray = IntStream.range(0, orderToSort.length).boxed()
                .sorted((i, j) -> Integer.compare(orderToSort[i], orderToSort[j]))
                .map(i -> urlToSort[i])
                .toArray(x -> new String[x]);
        String urlToString = String.join(",", urlToStringArray);
        return urlToString.replaceAll(",", "");
    }

    public static String[] sortUrlOption2(String[] urlToSort, int[] orderToSort) {
        for (int i = 0; i < orderToSort.length; i++) {
            for (int j = i + 1; j < orderToSort.length; j++) {
                if (orderToSort[i] > orderToSort[j]) {
                    int tempOrderToFollow = orderToSort[i];
                    String tempUrlToSort = urlToSort[i];
                    orderToSort[i] = orderToSort[j];
                    urlToSort[i] = urlToSort[j];
                    orderToSort[j] = tempOrderToFollow;
                    urlToSort[j] = tempUrlToSort;
                }
            }
        }
        return urlToSort;
    }


}
