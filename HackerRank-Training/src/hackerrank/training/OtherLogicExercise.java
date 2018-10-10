package hackerrank.training;

public class OtherLogicExercise {
    
    /* n = 5
    |*
    | *
    |  *
    |   *
    |    *
    |   *
    |  *
    | *
    |*
    */
    public void starChallenge1(int n){
        int x = (n*2)-1;
        for(int row = 1; row < n*2; row++){
            for(int col = 1; col <= n; col++){
                if(col == row || col == x){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
            x--;
        }
    }
    
    /* n = 5 
    |*
    | * *
    |  * * *
    |   * * * *
    |    * * * * *
    |   * * * *
    |  * * *
    | * *
    |*
    */
    public void starChallenge2(int n){
        int base = -2, tempRow = n-1, tempCol;
        for(int row = 1; row <= (2*n)-1; row++){
            if(row <= n){
                base += 2;
                tempCol = row;
            }else{
                base -= 2;
                tempCol = tempRow;
                tempRow--;
            }
            if(row == 1 || row == (2*n)-1){
                System.out.print("*");
            }else{
                for(int col = 1; col <= base; col++){
                    if(row == 2 || row == (2*n)-2){
                        System.out.print(" *");
                    }else{
                        if(col <= (tempCol-2)) System.out.print(" ");
                        else System.out.print(" *");
                    }
                }
            }
            System.out.println();
        }
    }
    
    /*Checking palindrome word.
    ex: develeved (true), hooh (true), exaxs (false).
    */
    public boolean isPalindrome(String word){
        int idxFront = 0;
        int idxBack = word.length() - 1;
        word = word.toLowerCase();
        while(idxBack - idxFront > 0){
            if(word.charAt(idxFront) == word.charAt(idxBack)){
                idxFront++;
                idxBack--;
            }else{
                return false;
            }
        }
        return true;
    }
    
    /*Generate prime numbers
    ex: input 8, output 2 3 5 7 11 13 17 19.
    */
    public String generatePrime(int number) {
        String primeList = "";
        int primeListCounter = 1;
        int numberCounter = 2;
        while(primeListCounter <= number){
            if(isPrime(numberCounter) == true){
               primeList += " "+ numberCounter;
               primeListCounter++; 
            }
            numberCounter++;
        }
        return primeList;
    }
    public boolean isPrime(int numberTest){
        int i;
        for (i = 2; i < numberTest; i++) {
            if (numberTest % i == 0) {
                return false;
            }
        }
        return true;
    }
}
