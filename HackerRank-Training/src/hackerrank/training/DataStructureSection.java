package hackerrank.training;

import hackerrank.training.datastructure.arrays.*;

public class DataStructureSection {
    
    public void callArraysProblem(int stage){
        switch(stage){
            case 1:
                //Arrays:Easy -> 'Array - DS'
                ArraysProblem1 AP1 = new ArraysProblem1();
                AP1.solution();
                break;
            case 2:
                //Arrays:Easy -> '2D Array - DS'
                ArraysProblem2 AP2 = new ArraysProblem2();
                AP2.solution();
                break;
            case 3:
                //Arrays:Easy -> 'Dynamic Array'
                ArraysProblem3 AP3 = new ArraysProblem3();
                AP3.solution();
                break;
            case 4:
                //Arrays:Easy -> 'Left Rotation'
                ArraysProblem4 AP4 = new ArraysProblem4();
                AP4.solution();
                break;
            case 5:
                //Arrays:Easy -> 'Sparse Arrays'
                ArraysProblem5 AP5 = new ArraysProblem5();
                AP5.solution();
                break;
        }
    }
}
