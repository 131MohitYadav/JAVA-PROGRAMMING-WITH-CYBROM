import java.util.*;

public class hpattern {
    public static void main (String args[]){

        // SOLID RECTANGEL PATTERN  //

//          int n = 4;
//         int m = 5;
//         // OUTER LOOP 
//   for(int i=1; i<=n; i++){
//     // INNER LOOP
//     for(int j=1; j<=m; j++){
//         System.out.print("*");
//     }
//     System.out.println();
//   }

              //  HOLLOW RECTANGLE  //

//               int n=4;
//               int m=5;
//               // OUTER LOOP
//         for(int i=1; i<=n; i++){
//             // INNER LOOP
//             for(int j=1; j<=m; j++){
//                 // CELL -> (i,j)
//                 if(i==1||j==1||i==n||j==m){
//                 System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

                   // HALF PYRAMID //

//             int n=4;
//             //OUTER LOOP 

//         for( int i=1; i<=n; i++){
//             //INNER LOOP
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

                    // INVERTED HALF PYRAMID //

        //              int n=4;
        //     //OUTER LOOP 

        // for( int i=n; i>=1; i--){
        //     //INNER LOOP
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

            //  INVERTED HALF PYRAMID WITH NUMBERS  //


              int n=5;

              for( int i=1; i>=n; i--){
                
                for(int j=1; j<=i; j++){
                    System.out.println(j+" ");
                }
                System.out.println();
              }
  
 }

   }
    

   

              