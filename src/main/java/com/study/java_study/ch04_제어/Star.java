package com.study.java_study.ch04_제어;

public class Star {
    public static void main(String[] args) {
//       for(int i = 0;  i < 5; i++) {
//           for (int j = 0; j < i + 1; j++) {
//               System.out.print("*");
//           }
//           System.out.println();
//        }
//        for(int a = 0;  a < 5; a++) {
//            for(int b = 0; b < 5 - a; b++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//           for (int i = 0; i < 5; i++) {
//               for (int j = 0; j < (4 - i); j++) {
//                   System.out.print(" ");
//               }
//               for (int k = 0; k < 1 + i; k++) {
//                   System.out.print("*");
//               }
//               System.out.println();
//           }
//           for (int i = 0; i < 5; i++) {
//               for (int j = 0; j < (4 - i); j++) {
//                   System.out.print(" ");
//               }
//               for (int k = 0; k < 1 + (i * 2); k++){
//                   System.out.print("*");
//               }
//               for (int l = 0; l < (4 - i); l++) {
//                   System.out.print(" ");
//               }
//               System.out.println();
//           }
             for(int i = 0; i < 5; i++) {
                for(int j = 0; j < (0 + i); j++) {
                System.out.print(" ");
                }
                for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");
                }
                System.out.println();
        }

    }
}
