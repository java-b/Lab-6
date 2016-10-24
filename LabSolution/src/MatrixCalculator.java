/**
 * Created by zhouyi on 16-10-21.
 */
public class MatrixCalculator {

    /**
     * This method is used to calculate the dot product of two matrices.
     *
     * @param a
     * @param b
     * @return
     */
    public static int[][] dot(int[][] a,int[][] b){
        // TODO: YOUR CODE HERE

        return null;
    }

    /**
     * This method is used to calculate the sum of two matrices.
     *
     * @param a
     * @param b
     * @return
     */
    public static int[][] sum(int[][] a,int[][] b){
        // TODO: YOUR CODE HERE

        return null;
    }

    /**
     * This method is used to calculate the value of an expression.
     * The expression can be the dot product or the sum of two matrices.
     * You may need to call the dot()/sum() method to calculate the value.
     *
     * @param expr
     * @return
     */
    public static int[][] calculate(String expr){
        // TODO: YOUR CODE HERE

        return null;
    }


    /**
     * This method can be used to print a matrix.
     * DO NOT MODIFY THIS METHOD
     *
     * @param a
     */
    public static void print(int[][] a){
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[0].length; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // TODO: YOUR CODE HERE


    }


    /**
     * This method is used to check your code.
     * DO NOT MODIFY THIS METHOD
     *
     */
    public static void validate(){
        if(!equal(calculate("[1,2,3;4,5,6;7,8,9]*[1,1;2,2;3,3]"),new int[][]{{14,14},{32,32},{50,50}}))
            System.out.println("You failed to calculate the dot product of two matrices");
        else
            System.out.println("You have calculated the dot product of two matrices correctly");
        if(!equal(calculate("[1,2,3;4,5,6]+[9,8,7;6,5,4]"),new int[][]{{10,10,10},{10,10,10}}))
            System.out.println("You failed to calculate the sum of two matrices");
        else
            System.out.println("You have calculated the sum of two matrices correctly");
    }

    /**
     * This method is used to check whether two 2-d arrays are equal
     * DO NOT MODIFY THIS METHOD
     *
     */
    public static boolean equal(int[][] a,int[][] b){
        if(a.length!=b.length || a.length==0 || a[0].length!=b[0].length)
            return false;
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                if(a[i][j]!=b[i][j])
                    return false;
        return true;
    }

}
