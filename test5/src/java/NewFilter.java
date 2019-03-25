/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author lovel
 */
public class NewFilter implements Filter {
    
    private static final boolean debug = true;
int a=0;
    // The filter configuration object we are associated with.  If
    // this value is null, this filter instance is not currently
    // configured. 
    private FilterConfig filterConfig = null;
    
    public NewFilter() {
    }    
    
   
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
    
        PrintWriter p=response.getWriter();
        p.println("before filter"+a++);
        p.println("after filter"+a);
    }

    
    public void destroy() {        
    }

   
    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
       
            }
        }
    

   