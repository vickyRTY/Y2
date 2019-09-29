package cn.bdqn.servlet;

import cn.bdqn.entity.Branches;
import cn.bdqn.service.BranchesSerice;
import cn.bdqn.service.impl.BranchesServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/banche")
public class BranchesServlet extends HttpServlet {
    BranchesSerice branchesSerice=new BranchesServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        List<Branches> brancheInfo = branchesSerice.getBranchesList();
        req.getSession().setAttribute("brancheInfo",brancheInfo);
        req.getRequestDispatcher(req.getContextPath()+"/list.jsp").forward(req,resp);
    }
}
