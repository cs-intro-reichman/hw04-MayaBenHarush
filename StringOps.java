public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String str = " tWo wordS";
        //System.out.println(capVowelsLowRest(str));
        System.out.println(camelCase(str));
        //System.out.println(allIndexOf(str,'l'));
        //int [] arr= allIndexOf(str,'l');
        

        
    }

    //a,e,i,o,u
    public static String capVowelsLowRest (String string) {
        String temp= "";
        char c ;
        for ( int i = 0; i< string.length(); i++){
            c=string.charAt(i);
            if(c =='a'|| c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O'|| c == 'u' || c == 'U') {

                if( string.charAt(i) == 'a' ||string.charAt(i) == 'A'){
                    temp += 'A';
                }
    
                if( string.charAt(i) == 'e' ||string.charAt(i) == 'E'){
                    temp += 'E';
                }
                if( string.charAt(i) == 'i' ||string.charAt(i) == 'I'){
                    temp += 'I';
                }
                if( string.charAt(i) == 'o' ||string.charAt(i) == 'O'){
                    temp += 'O';
                }
                if( string.charAt(i) == 'u' ||string.charAt(i) == 'U'){
                    temp += 'U';
                }
                if( string.charAt(i) == ' ' ){
                    temp += ' ';
                }
                
                
            }
        
            else{
                if(string.charAt(i) > 65 && string.charAt(i) <90){   //if  uppercase 
                    temp += (char)(string.charAt(i) + 32);
                }
                else{
                    temp += string.charAt(i);

                }

            }
        }
        return temp;
    }

    public static String camelCase (String string) {
        String temp= "";
        int index = 0;  
        while(string.charAt(index) == ' ' ) { //if the string starts with a space
            index ++;
        }
        while(index <string.length()){ 
            if(string.charAt(index) >= 65 && string.charAt(index) <= 90){   //if  uppercase so change
                temp += (char)(string.charAt(index) + 32);
            }
            if(string.charAt(index) >= 97 && string.charAt(index) <= 122){   //if  lowercase so keep
                temp += string.charAt(index);
            }
    
            if(string.charAt(index) == ' ' && index + 1 != string.length()){ //not the last index
                index++;   
                if(string.charAt(index) >= 65 && string.charAt(index) <= 90) {//if  uppercase so keep
                    temp += string.charAt(index);
                }

                //if  lowercase so change
                if(string.charAt(index) >= 97 && string.charAt(index) <= 122) { 
                    temp += (char)(string.charAt(index) - 32);

                }
            }
            index ++;
            
        }

        return temp;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count =0 ; //count the appears of chr in string
        for( int i = 0; i < string.length(); i++){
            if(string.charAt(i) == chr){
                count++;
            }
        }
        int [] index = new int[count];
        int j=0;
        for( int i = 0; i < string.length(); i++){
            if(string.charAt(i) == chr){
                index[j]=i; 
                j++; 
            }
              
        }
        return index;
    }
}
