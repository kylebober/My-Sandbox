
package com.sandbox.service.one.soap.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-09T16:02:41.485-04:00
 * Generated source version: 2.5.2
 * 
 */
public final class SandboxServiceOne_SandboxServiceOnePort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.sandbox.com/SandboxServiceOne/", "SandboxServiceOne");

    private SandboxServiceOne_SandboxServiceOnePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SandboxServiceOne_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SandboxServiceOne_Service ss = new SandboxServiceOne_Service(wsdlURL, SERVICE_NAME);
        SandboxServiceOne port = ss.getSandboxServiceOnePort();  
        
        {
        System.out.println("Invoking executePentahoJob...");
        java.lang.String _executePentahoJob_arg0 = "";
        port.executePentahoJob(_executePentahoJob_arg0);


        }
        {
        System.out.println("Invoking testSpringDI...");
        port.testSpringDI();


        }
        {
        System.out.println("Invoking executePentahoTransformation...");
        java.lang.String _executePentahoTransformation_arg0 = "";
        port.executePentahoTransformation(_executePentahoTransformation_arg0);


        }
        {
        System.out.println("Invoking sandboxServiceOneEcho...");
        port.sandboxServiceOneEcho();


        }

        System.exit(0);
    }

}
