/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.controller.command;

import com.br.lp3.model.dao.Userlp3DAO;
import com.br.lp3.model.entities.Userinfo;
import com.br.lp3.model.entities.Userlp3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 31560555
 */
public class PageCommand implements Command {

    Userlp3DAO userlp3DAO = lookupUserlp3DAOBean();

    private HttpServletRequest request;
    private HttpServletResponse response;
    private String responsePage;

    @Override
    public void init(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    @Override
    public void execute() {
        responsePage ="home.jsp";
        String action = request.getParameter("command").split("\\.")[1];
        request.setAttribute("page", "home.jsp");
    }


        @Override
        public String getResponsePage() {
        return responsePage;
    }

    private Userlp3DAO lookupUserlp3DAOBean() {
        try {
            Context c = new InitialContext();
            return (Userlp3DAO) c.lookup("java:global/ProjetoBase4G/ProjetoBase4G-ejb/Userlp3DAO!com.br.lp3.model.dao.Userlp3DAO");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
