package com.company;

public class Main {

    public static void main(String[] args) {
        String str="1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk";
        str = str.replaceAll("[^\\d]", " ");
        str = str.replaceAll(" +", " ");
        //System.out.println(str);
        String[] arr=(str.split(" "));
        double sharee_piece =Double.parseDouble(arr[0]);
        double sharee_price =Double.parseDouble(arr[1]);
        double shirt_piece =Double.parseDouble(arr[2]);
        double shirt_price =Double.parseDouble(arr[3]);
        double pant_piece =Double.parseDouble(arr[4]);
        double pant_price =Double.parseDouble(arr[5]);
        double total=sharee_price+shirt_price+pant_price;
        double quantity=sharee_piece+shirt_piece+pant_piece;
        System.out.println("Total price "+(int)total);
        System.out.println("Total price "+(int)quantity);
    }
}
