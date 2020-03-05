package guru.springframework.spring5webapp.model;

public class Test {
    public static String solution(int N) {
        return (Integer.toBinaryString(N));
    }







//        // write your code in Java SE 8
//        int x = 0, y = 0, jump = 0;
//        for (int i = 0; i < B.length; i++) {
//            if (B[i].contains("O")) {
//                x = B[i].indexOf("O");
//                y = i;
//            }
//        }
//        Stack<Integer> currentRowPositions = new Stack<>();
//        currentRowPositions.push(x-1); //checking end String
//        currentRowPositions.push(x+1);
//        int i = 1;
//        for (int row = y-1; row >= 0; row--) {
//
//            Stack<Integer> nextRowPositions = new Stack<>();
//            while(!currentRowPositions.isEmpty()) {
//                Integer column = currentRowPositions.pop();
//
//                if(column >= 0 && column < B[row].length()) {
//                    if (B[row].charAt(column) == 'X') {
//                        if(x > column) {
//                            nextRowPositions.push(column - 1);
//                        } else {
//                            nextRowPositions.push(column + 1);
//                        }
//                    }
//                    if(i > 1) {
//                        if (B[row].charAt(column) == '.' || B[row].charAt(column) == '.') {
//                            jump++;
//                            x = column;
//                        }
//                    }
//                    i++;
//                }
//            }
//            while(!nextRowPositions.isEmpty()) {
//                currentRowPositions.push(nextRowPositions.pop());
//            }
//        }
//        return jump;

    public static void  permutation(String str){
        permutation (str,"");

    }
    public static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
    static int highestPowerof2(int n)
    {
        int res = 0;
        for (int i = n; i >= 1; i--)
        {
            // If i is a power of 2
            if ((i & (i - 1)) == 0)
            {
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //String [] B = new String[]{"X....", ".X...", "..O..", "...X.", "....."};
        int n = 10;
        //System.out.println(solution(n));
        //permutation("Idan");
        System.out.println(highestPowerof2(n));

    }




/*        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[index] != -1) {
                index = A[index];
            } else {
                return ++i;
            }
        }
        return A.length;
    }*/

   /*     Collections.sort(sorted);
        for (Integer i : sorted) {
            if (i > min) {
                min++;
                if(i!=min) {
                    return min;
                }
            }
        }
        return ++min;*/
    //}


}
