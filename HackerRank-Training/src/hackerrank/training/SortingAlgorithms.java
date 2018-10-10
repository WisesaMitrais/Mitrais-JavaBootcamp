package hackerrank.training;

public class SortingAlgorithms {
    int temp, idx, currPos;
    
    public int[] quickSort(int[] input){
        return input;
    }
    
    public int[] mergeSort(int[] input){
        return input;
    }
    
    public int[] timSort(int[] input){
        return input;
    }
    
    public int[] heapSort(int[] input){
        return input;
    }
    
    public int[] bubbleSort(int[] input){
        int countSwap;
        do{
            countSwap = 0;
            for(idx = 0; idx < input.length-1; idx++){
                if(input[idx] > input[idx + 1]){
                    temp = input[idx];
                    input[idx] = input[idx + 1];
                    input[idx + 1] = temp;
                    countSwap++;
                }
            }
        }while(countSwap != 0);
        return input;
    }
    
    public int[] insertionSort(int[] input){
        int tempPos;
        currPos = 1;
        while(currPos <= input.length - 1){
            tempPos = currPos;
            for(idx = currPos - 1; idx >= 0; idx--){
                if(input[idx] > input[tempPos]){
                    temp = input[idx];
                    input[idx] = input[tempPos];
                    input[tempPos] = temp;
                    tempPos = idx;
                }
            }
            currPos++;
        }
        return input;
    }
    
    public int[] selectionSort(int[] input){
        currPos = 0;
        while(currPos < input.length - 1){
            int minIdx = currPos;
            for(idx = currPos + 1; idx < input.length; idx++){
                if(input[minIdx] > input[idx]) minIdx = idx;
            }
            temp = input[minIdx];
            input[minIdx] = input[currPos];
            input[currPos] = temp;
            currPos++;
        }
        return input;
    }
    
    public int[] treeSort(int[] input){
        return input;
    }
    
    public int[] shellSort(int[] input){
        return input;
    }
    
    public int[] bucketSort(int[] input){
        return input;
    }
    
    public int[] radixSort(int[] input){
        return input;
    }
    
    public int[] countingSort(int[] input){
        return input;
    }
    
    public int[] cubeSort(int[] input){
        return input;
    }
}
