package service;

import model.ModelHackerRankProblem;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceAlgorithmCategory implements InterfaceServiceHackerRankProblem {

    private ModelHackerRankProblem mhrp;

    @Autowired
    public ServiceAlgorithmCategory(ModelHackerRankProblem mhrp) {
        this.mhrp = mhrp;
    }

    @Override
    public int getProblemID() {
        return this.mhrp.getProblemID();
    }

    @Override
    public String getProblemCategory() {
        return this.mhrp.getProblemCategory();
    }

    @Override
    public String getProblemType() {
        return this.mhrp.getProblemType();
    }

    @Override
    public String getPDFName() {
        return this.mhrp.getPdfName();
    }

    @Override
    public ModelHackerRankProblem getProblem() {
        return this.mhrp;
    }

}
