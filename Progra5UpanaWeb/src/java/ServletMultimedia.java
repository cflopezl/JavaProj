/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author C-Lo 12
 */
public class ServletMultimedia extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("image/jpg;charset=UTF-8");
        OutputStream out=response.getOutputStream();
        Frame frame = null;
        Graphics g = null;
        try {
            //Step 1:  Create the frame and window.
            frame = new Frame();
            frame.addNotify();
            //Step 2:  Draw the Image.
            Image image = frame.createImage(400, 60);
            g = image.getGraphics();
            g.setFont(new Font("Serif", Font.ITALIC, 48));
            g.setColor(Color.red);
            g.drawString("Programación V!!!", 10, 50);
            BufferedImage bImg = new BufferedImage(400, 60, BufferedImage.TYPE_INT_RGB);
            g = bImg.getGraphics();
            g.drawImage(image, 0, 0, null);
            ImageIO.write(bImg, "jpg", out);
        } finally {
            //clean up resources
            if (g != null) {
                g.dispose();
            }
            if (frame != null) {
                frame.removeNotify();
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
