package org.example.arraytest;

import java.util.Objects;
import java.util.Scanner;

/**
 * &#064;program: Arraywierd
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create: -11-19 17:12
 */
public class Arraywierd {
        public static void main ( String[] args ) {
            Scanner input = new Scanner(System.in);
            int i = 0;
            while(i < 500) {
                char[] ss = new char[ 0 ];
                for ( int t = 0 ; t < 500 ; t++ ) {
                    String str = input.next ( );
                    if ( "0".equals ( input.next ( ) ) ) {
                        break;
                    }
                    ss = str.toCharArray ( );
                }
                for ( int j = 0 ; j < ss.length ; j++ ) {
                    if ( Objects.equals ( ss[ j ] , "0" ) ) {
                        break;
                    }
                    for ( int k = i + 1 ; k < ss.length ; k++ ) {
                        if ( Objects.equals ( ss[ k ] , "0" ) ) {
                            break;
                        }
                        if ( ! Objects.equals ( ss[ k ] , ss[ j ] ) ) {
                            ss[ j ] += ss[ k ];
                        }
                    }
                }
                for ( char s : ss ) {
                    System.out.print ( s );
                }
            }
            i++;
        }
        
    }

