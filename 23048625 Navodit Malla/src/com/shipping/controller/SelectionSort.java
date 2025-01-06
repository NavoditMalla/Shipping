/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shipping.controller;
import java.util.LinkedList;
import com.shipping.model.Shipping;

/**
 *
 * @author navo
 */
    public class SelectionSort{
    public void selectionSortByFrom(LinkedList<Shipping> list, boolean ascending) {
        int size = list.size();
        for(int i=0; i<size - 1;i++){
            int selectedIndex = i;

            for(int j = i+1; j<size;j++){
                // Compare based on the order (ascending or descending)
                if (ascending) {
                    if (list.get(j).getFrom().compareToIgnoreCase(list.get(selectedIndex).getFrom()) < 0) {
                        selectedIndex = j;
                    }
                } 
                else{
                    if (list.get(j).getFrom().compareToIgnoreCase(list.get(selectedIndex).getFrom()) > 0) {
                        selectedIndex = j;
                    }
                }
            }

            // Swap the selected element with the current index
            if(selectedIndex != i){
                Shipping temp = list.get(i);
                list.set(i, list.get(selectedIndex));
                list.set(selectedIndex, temp);
            }
        }
    }
}

