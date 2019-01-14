public class Main8
{


    public static void main(String[] args) {
      
        int mat[][] = 
        { 
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}, 
            {13, 14, 15, 16} 
        }; 
        setZero(mat);
    }
            

public static void setZero(int [][] matrix){
    boolean [] row= new boolean [matrix.length];
    boolean [] column = new boolean [matrix[0].length];

    for(int i =0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                row[i]= true;
                column[j]=true;
            }
        }
    }

        for(int i=0;i<row.length;i++){
            if(row[i])  nullifyRow(matrix,i);
        }
         for(int j=0;j<column.length;j++){
            if(column[j])  nullifyColumn(matrix,j);
        }


 
    }
    public static void nullifyRow(int [][] matrix,int row){
        for(int j=0;j<matrix[0].length;j++){
            matrix[row][j]=0;
        }

    }
     public static void nullifyColumn(int [][] matrix,int col){
          for(int i=0;i<matrix[0].length;i++){
            matrix[i][col]=0;
        }
        
    }





  
}
