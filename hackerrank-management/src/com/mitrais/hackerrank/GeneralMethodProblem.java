package com.mitrais.hackerrank;

import java.util.*;

public abstract class GeneralMethodProblem {

    abstract void printAllProblem(); //Print all problem.
    abstract void printAllProblem(String problemInitial); //Print all problem based on one problem type.
    abstract void printTotalProblem(String problemInitial);
    abstract List<ProblemModel> getAllProblem(String problemInitial); //Get all problem based on one problem type.
}
