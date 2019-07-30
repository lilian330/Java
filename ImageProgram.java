public class ImageProgram {
    public static void main(String [] args){
        //random the 10 x 10 two-dimensional booleanArray
        boolean [][] booleanArray = new boolean[10][10];
        for (int y = 0; y < 10; y++){
            for(int x = 0; x<10; x++) {
                byte aByte = (byte) (Math.random() * 2);
                if (aByte < 1) {
                    booleanArray[x][y] = true;
                }
            }
        }
        //Print the booleanArray with "O" for true and "." for false.
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (booleanArray[x][y]){
                    System.out.print("O ");
                }
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
        int maxx = 0;
        int maxy = 0;
        for (int x = 0; x < 10; x++) {
            int maxsubx1 = 0;
            int maxsubx2 = 0;
            for (int y = 0; y < 10; y++) {
                if (y > 0) {
                    if (booleanArray[x][y]) {
                        if (booleanArray[x][y - 1]) {
                            maxsubx1 += 1;
                        }
                        if (maxsubx2 < maxsubx1) {
                            maxsubx2 = maxsubx1;
                        }
                    } else {
                        maxsubx1 = 0;
                    }
                }
            }
            if (maxx < maxsubx2) {
                maxx = maxsubx2;
            }
        }

        //
        for (int y = 0; y < 10; y++) {
            int maxsuby1 = 0;
            int maxsuby2 = 0;
            for (int x = 0; x < 10; x++) {
                if (x > 0) {
                    if (booleanArray[x][y]) {
                        if (booleanArray[x - 1][y]) {
                            maxsuby1 += 1;
                        }
                        if (maxsuby2 < maxsuby1) {
                            maxsuby2 = maxsuby1;
                        }
                    } else {
                        maxsuby1 = 0;
                    }
                }
            }
            if (maxy < maxsuby2) {
                maxy = maxsuby2;
            }
        }
        maxx += 1;
        maxy += 1;
        //print
        System.out.println("The longest horizontal sequence is: " + maxx);
        System.out.println("The longest vertical sequence is: " + maxy);
    }

}
