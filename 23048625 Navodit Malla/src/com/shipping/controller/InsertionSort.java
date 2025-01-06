/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shipping.controller;
import com.shipping.model.Shipping;
import java.util.LinkedList;

public class InsertionSort{
    public void insertionSortByTo(LinkedList<Shipping> list, boolean ascending) {
        int size = list.size();
            for (int i = 1; i < size; i++) {
                Shipping key = list.get(i);
                int j = i - 1;

                // Compare based on the order (ascending or descending)
                while (j >= 0 && 
                       ((ascending && list.get(j).getTo().compareToIgnoreCase(key.getTo()) > 0) ||
                        (!ascending && list.get(j).getTo().compareToIgnoreCase(key.getTo()) < 0))) {
                    list.set(j + 1, list.get(j));
                    j--;
                }
                list.set(j + 1, key);
            }

}
}
