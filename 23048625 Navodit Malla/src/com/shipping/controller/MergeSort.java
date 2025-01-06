package com.shipping.controller;


import com.shipping.model.Shipping;
import java.util.LinkedList;

public class MergeSort{

    public void mergeSort(LinkedList<Shipping> list, boolean ascending){
        if(list.size() > 1){
            int mid = list.size() / 2;
            LinkedList<Shipping> left = new LinkedList<>(list.subList(0, mid));
            LinkedList<Shipping> right = new LinkedList<>(list.subList(mid, list.size()));
            mergeSort(left, ascending);
            mergeSort(right, ascending);
            merge(list, left, right, ascending);
        }
    }

    private void merge(LinkedList<Shipping> result, LinkedList<Shipping> left, LinkedList<Shipping> right, boolean ascending){
        result.clear();
        int i = 0, j = 0;
        while(i<left.size() && j<right.size()){
            boolean condition = ascending ? left.get(i).getShipno() <= right.get(j).getShipno(): left.get(i).getShipno() >= right.get(j).getShipno();
            if(condition){
                result.add(left.get(i++));
            }
            else{
                result.add(right.get(j++));
            }
        }
        while(i < left.size()){
            result.add(left.get(i++));
        }
        while(j < right.size()){
            result.add(right.get(j++));
        }
    }

}

