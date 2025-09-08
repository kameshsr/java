
public class Maximum {
    public static void main(String[] args) {
        int[][] dimensions = {{2,6},{5,1},{3,10},{8,4}};
        //Maximum max = new Maximum();
        System.out.println(areaOfMaxDiagonal(dimensions));
    }
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int max = 0;
        int area = 0;
        for (int i = 0; i < dimensions.length; i++) {
            for (int j = 0; j < dimensions[i].length-1; j++) {
                int diag1 = (int) Math.sqrt(dimensions[i][j] + dimensions[i][j + 1]);
                if (diag1 > max) {
                    area = dimensions[i][j] * dimensions[i][j + 1];
                } else{
                    area = dimensions[i][j]*dimensions[i][j];
                }
            }
        }
        return area;

    }
}