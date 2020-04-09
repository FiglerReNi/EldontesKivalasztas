/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class EldontesKivalasztas {
    public static void main(String[]args){
        int[] a=new int[25];
        for(int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*51);
            System.out.print(a[i]+" ");
                    }
        int y=(int)(Math.random()*51);
        System.out.println();
        System.out.println("A keresett szám: "+y);
        int i=0;
        while((i<25) && (a[i]!=y) ){
            i++;            
        }
             if(i<25) {
                 System.out.println("A keresett szám benne van a tömbben, helye: "+(i+1));
             } 
             else{
                 System.out.println("A keresett szám nem található.");
             }
    }
    
}
