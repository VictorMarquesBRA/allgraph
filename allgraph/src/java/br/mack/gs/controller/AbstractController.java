/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.gs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author henrique
 */
public abstract class AbstractController implements Controller {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private String responsePage;

    @Override
    public void init(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    @Override
    public String getResponsePage() {
        return responsePage;
    }

    public void setResponsePage(String responsePage) {
        this.responsePage = responsePage;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }
    
}
