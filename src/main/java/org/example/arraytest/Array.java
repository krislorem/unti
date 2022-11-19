package org.example.arraytest;

import java.util.Scanner;

/**
 * @author GK_L2
 */
public class Array {
    Scanner scanner = new Scanner ( System.in );
    private int m;
    private int n;
    private int[][] arr;
    
    public Array ( ) {
    }
    
    public void setArr ( int m , int n ) {
        arr = new int[ m ][ n ];
        for ( int i = 0 ; i < m ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                arr[ i ][ j ] = scanner.nextInt ( );
            }
        }
    }
    
    public void setM ( ) {
        this.m = scanner.nextInt ( );
    }
    
    public void setN ( ) {
        this.n = scanner.nextInt ( );
    }
    
    public int[][] getArr ( ) {
        return this.arr;
    }
    
    public int getM ( ) {
        return this.m;
    }
    
    public int getN ( ) {
        return this.n;
    }
}
