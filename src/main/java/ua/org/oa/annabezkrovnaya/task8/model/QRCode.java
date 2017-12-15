package ua.org.oa.annabezkrovnaya.task8.model;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import javax.servlet.annotation.WebServlet;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "QRServlet", urlPatterns = {"localhost"})

public class QRCode extends javax.servlet.http.HttpServlet{

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            if (request.getParameterMap().containsKey("code")) {
                String code = request.getParameter("code");
                Map<EncodeHintType,Object> hints = new HashMap<>();
                hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
                hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
                BitMatrix matrix = null;
                try {
                    matrix = new QRCodeWriter().encode(code, com.google.zxing.BarcodeFormat.QR_CODE, 300, 300, hints);
                } catch (WriterException e) {
                    e.printStackTrace();
                }
                response.setContentType("image/jpeg");
                //ImageIO.write(matrixToImage(matrix), "jpg", response.getOutputStream());

                ImageIO.write(matrixToImage(matrix), "jpg", File.createTempFile("qr_code", "jpg", new File("src/main/resources/QR")));
            } else {
                PrintWriter w = response.getWriter();
                w.print("parameter code not found!");
                w.flush();
                w.close();
            }
        }

        private BufferedImage matrixToImage(BitMatrix matrix) {
            int width = matrix.getWidth();
            int height = matrix.getHeight();
            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            int[] pixels = new int[width*height];
            for (int j = 0; j < height; j++) {
                for (int i = 0; i < width; i++) {
                    pixels[j*width + i] = matrix.get(j, i) ? Color.BLACK.getRGB() : Color.WHITE.getRGB();
                }
            }
            image.setRGB(0, 0, width, height, pixels, 0, width);
            return image;
        }

        protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            doPost(request, response);
        }
    }