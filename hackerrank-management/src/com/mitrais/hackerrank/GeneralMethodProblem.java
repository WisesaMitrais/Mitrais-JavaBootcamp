package com.mitrais.hackerrank;

import java.util.*;

public abstract class GeneralMethodProblem {

    abstract int getTotalProblem(); //Get total problem in all problem type.
    abstract int getTotalProblem(String problemInitial); //Get total problem based on one problem type.
    abstract List<List<ProblemModel>> getAllProblem(); //Get all problem in all problem type.
    abstract List<ProblemModel> getAllProblem(String problemInitial); //Get all problem based on one problem type.
}
