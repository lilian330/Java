public class HistogramProgram {
    public static void main(String[] args){
        int [] nums = new int[100];//Define an integer array with 100 rooms
        //Randomly generated array
        for(int i=0;i<100;i++){
            nums[i]=(int)(Math.random()*10);
        }
        //Print out the number of occurrences for each number
        for(int i=0;i<10;i++){
            System.out.print(i+" | ");
            for(int j=0;j<100;j++) {
                if (nums[j] == i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}