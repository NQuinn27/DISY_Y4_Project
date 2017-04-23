/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmdns;
import com.sun.net.httpserver.Headers;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.CORBA.ORBPackage.InvalidName;
import smarthome.SmartHome;

public class HTTPServer {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8002), 0);
        server.createContext("/index.html", new IndexHandler());
        server.createContext("/livingroom", new LivingRoomHandler());
        server.createContext("/bathroom", new BathroomHandler());
        server.createContext("/kitchen", new KitchenHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }
    
    static class HomeHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            
        }
    }
    
    static class IndexHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String root = "src/main/resources/";
            URI uri = t.getRequestURI();
            System.out.println("looking for: "+ root + uri.getPath());
            String path = uri.getPath();
            File file = new File(root + path).getCanonicalFile();

            if (!file.isFile()) {
              // Object does not exist or is not a file: reject with 404 error.
              String response = "404 (Not Found)\n";
              t.sendResponseHeaders(404, response.length());
              OutputStream os = t.getResponseBody();
              os.write(response.getBytes());
              os.close();
            } else {
              // Object exists and is a file: accept with response code 200.
              String mime = "text/html";
              if(path.substring(path.length()-3).equals(".js")) mime = "application/javascript";
              if(path.substring(path.length()-3).equals("css")) mime = "text/css";            

              Headers h = t.getResponseHeaders();
              h.set("Content-Type", mime);
              t.sendResponseHeaders(200, 0);              

              OutputStream os = t.getResponseBody();
              FileInputStream fs = new FileInputStream(file);
              final byte[] buffer = new byte[0x10000];
              int count = 0;
              while ((count = fs.read(buffer)) >= 0) {
                os.write(buffer,0,count);
              }
              fs.close();
              os.close();
            }
        }
    }

    static class LivingRoomHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String query = t.getRequestURI().getQuery();
            String res = SmartHome.livingRoomHandler(query);
            System.out.print(res);
            t.sendResponseHeaders(200, res.length());
            OutputStream os = t.getResponseBody();
            os.write(res.getBytes());
            os.close();
        }
    }
    
    static class BathroomHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String query = t.getRequestURI().getQuery();
            String res = SmartHome.bathroomHandler(query);
            System.out.print(res);
            t.sendResponseHeaders(200, res.length());
            OutputStream os = t.getResponseBody();
            os.write(res.getBytes());
            os.close();
        }
    }
    
    static class KitchenHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String query = t.getRequestURI().getQuery();
            String res = SmartHome.kitchenHandler(query);
            System.out.print(res);
            t.sendResponseHeaders(200, res.length());
            OutputStream os = t.getResponseBody();
            os.write(res.getBytes());
            os.close();
        }
    }
    
    
    
}
