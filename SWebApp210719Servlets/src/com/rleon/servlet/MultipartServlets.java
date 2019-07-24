package com.rleon.servlet;

import com.rleon.servlet.Constants;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/** 
 * 
 * @author DEV RLEON
 *
 */

@WebServlet(name = "MultiPartServlet", urlPatterns = {"/multiPartServlet"})
public class MultipartServlets extends HttpServlet {
	
	private static final long serialVersionUID = 1L;	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		   
	  if (ServletFileUpload.isMultipartContent(req)) {

          DiskFileItemFactory factory = new DiskFileItemFactory();
          factory.setSizeThreshold(Constants.MEMORY_THRESHOLD);
          factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

          ServletFileUpload upload = new ServletFileUpload(factory);
          /** Enviamos el tamaño maximo de archivo**/
          upload.setFileSizeMax(Constants.MAX_FILE_SIZE);
          /** Enviamos el tamaño maximo del Request**/
          upload.setSizeMax(Constants.MAX_REQUEST_SIZE);
          /** armamos la ruta de guardado**/
          String uploadPath = getServletContext().getRealPath("") + File.separator + Constants.UPLOAD_DIRECTORY;
          
          /** validamos la existencia de la carpeta contenedora y si no existe la creamoss **/
          File uploadDir = new File(uploadPath);
          if (!uploadDir.exists()) {
              uploadDir.mkdir();
          }

          try {
        	  /** Obtenemos nuestro archivo enviado */
              List<FileItem> formItems = upload.parseRequest(req);

              if (formItems != null && formItems.size() > 0) {
                  for (FileItem item : formItems) {
                      if (!item.isFormField()) {
                          String fileName = new File(item.getName()).getName();
                          String filePath = uploadPath + File.separator + fileName;
                          File storeFile = new File(filePath);
                          item.write(storeFile);
                          req.setAttribute("message", "File " + fileName + " Guardado Correcto!");
                      }
                  }
              }
          } catch (Exception ex) {
              req.setAttribute("message", "Error al Guardar: " + ex.getMessage());
          }
          getServletContext().getRequestDispatcher("/result.jsp").forward(req, res);
      }
  }

}
