/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.html;

import com.google.gwt.core.client.js.JsType;

/**
 *
 * @author iron
 */
@JsType(prototype = "CSSStyleSheet")
public interface CSSStyleSheet extends StyleSheet{
    
    void insertRule(String rulem,int index);
    
    void deleteRule(int index);
    
}
