package cn.bdqn.dao.impl;

import cn.bdqn.dao.BranchesDao;
import cn.bdqn.entity.Branches;
import cn.bdqn.util.BaseDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BranchesDaoImpl extends BaseDao implements BranchesDao {
    @Override
    public List<Branches> getList() {

        String sql = "SELECT `id`,`businessNo`,`name`,`cityArea`,`address`,`telephone`,`summary` FROM `branches`";
        List<Branches> branches = new ArrayList<>();
        rs = this.executeQuery(sql);
        try {

            if (null != rs){
                while (rs.next()){
                    Branches  branche = new Branches();
                    branche.setId(rs.getInt("id"));
                    branche.setName(rs.getString("name"));
                    branche.setCityArea(rs.getString("cityArea"));
                    branche.setAddress(rs.getString("address"));
                    branche.setTelephone(rs.getString("telephone"));
                    branches.add(branche);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return branches;
    }
}
