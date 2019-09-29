package cn.bdqn.service.impl;

import cn.bdqn.dao.BranchesDao;
import cn.bdqn.dao.impl.BranchesDaoImpl;
import cn.bdqn.entity.Branches;
import cn.bdqn.service.BranchesSerice;

import java.util.List;

public class BranchesServiceImpl implements BranchesSerice {
        BranchesDao branchesDao=new BranchesDaoImpl();
    @Override
    public List<Branches> getBranchesList() {
        return branchesDao.getList();
    }
}
