import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
        int [] a= {1, 1, 2, 2, 2,3};
        int [] b= {3,2,2,1,1};
        
        
        //System.out.println(findMissingInt(a));
        //System.out.println(secondMaxValue(a));
        //System.out.println(onlyOnce(a));
        //System.out.println(onlyOnce(b));
        //if(onlyOnce(a).equals(onlyOnce(b))){
        //    System.out.println("yes");
        //}
        //System.out.println((containsTheSameElements(a,b)));
        
        System.out.println(isSorted(b));
    }
    
       
        

    
    public static int findMissingInt (int [] array) {
        int miss = 0 ; //the missing number 
        boolean exist = false;
        for( int i = 0; i <= array.length; i++){
            exist = false;
            for(int j = 0; j < array.length; j++){
                if( array[j] == i){
                    exist = true;
                }
            }
            if( exist == false){
                miss= i;
                break;     
            }
        }
        return miss;
    }

    public static int secondMaxValue(int [] array) {
        int [] temp = sort(array);
        return temp [ temp.length -2];
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        
        String str1 = onlyOnce(array1);
        String str2 = onlyOnce(array2);
        boolean same =true;
        if( str1.length() == str2.length()){
            for( int i = 0; i <str1.length(); i++){
                if( str1.charAt(i) != str2.charAt(i)){
                    return false;
                }
            }
        }
        else{
            return false;
        } 
        return true; 
    }

    public static boolean isSorted(int [] array) {
        boolean max=true;
        boolean min =true;
        int [] tempMin = sort(array);
        //checks if sorted from min to max
        for( int i = 0; i <array.length; i++){
            if( array[i] != tempMin[i]){
                min= false;
            }
        }
        int [] tempMax = sort2(array);
        //checks if sorted from max to min
        for( int i = 0; i <array.length; i++){
            if( array[i] != tempMax[i]){
                max= false;
            }
        }
        if( (min == false) && (max == false) ){
            return false;
        }
    
        return true;
    }



    public static int [] sort (int [] array) { // order array from min to max
        int [] temp = new int [ array.length]; //new array  calld temp that is equal to original one
        for(int i = 0; i< array.length; i++){ 
            temp[i] = array[i];
        }
        int same = 0;
        for( int i = 0; i < array.length - 1 ;i++){
            for(int j = i; j < array.length - 1; j++){
                if(temp[i]>temp[j + 1]){
                    same = temp[i];
                    temp[i] = temp[j + 1];
                    temp[j + 1] = same;
                }
            }
        }
        return temp;

    }
    public static int [] sort2 (int [] array) { // order array from max to min
        int [] temp = new int [ array.length]; //new array  calld temp that is equal to original one
        for(int i = 0; i< array.length; i++){ 
            temp[i] = array[i];
        }
        int same = 0;
        for( int i = 0; i < array.length - 1 ;i++){
            for(int j = i; j < array.length - 1; j++){
                if(temp[i]<temp[j + 1]){
                    same = temp[i];
                    temp[i] = temp[j + 1];
                    temp[j + 1] = same;
                }
            }
        }
        return temp;

    }


    //gets an array and returns string of the arrat number without duplicate
    public static String onlyOnce ( int [] array ){
        int [] temp = sort(array);
        int i = 0;
        String str ="";
        while( i < temp.length -1){
            if(temp[i] == temp[i+1]){
                i++;
            }
            else{
                str += temp[i];
                i++;
            }
        }
        str += temp[ temp.length-1];
        return str;
    }
    
}


