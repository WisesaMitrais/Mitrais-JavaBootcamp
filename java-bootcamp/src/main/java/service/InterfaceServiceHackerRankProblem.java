package service;

import model.ModelHackerRankProblem;

public interface InterfaceServiceHackerRankProblem {
    int getProblemID();
    String getProblemCategory();
    String getProblemType();
    String getPDFName();
    ModelHackerRankProblem getProblem();
}
