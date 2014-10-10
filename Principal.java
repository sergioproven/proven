package com.daw.model; 


/** 
 * 
 * @author alumne 
 */ 
public class Principal { 
    
    public Principal() { 
        
    } 
    
     
    public static void main(String argv[]) { 
        ImageManipulation im = new ImageManipulation(); 
        try { 
            
            BufferedImage in = javax.imageio.ImageIO.read(new java.io.File("/home/alumne/Descargas/juancar.jpg")); 
            
            // Graphics2D 
            BufferedImage out = im.scaleImage(in, BufferedImage.TYPE_INT_RGB, 200, 300); 
            javax.imageio.ImageIO.write(out, "JPG", new java.io.File("/home/alumne/Descargas/juancarScaled.jpg")); 
            
            // Library to Scale Images 
            // http://www.thebuzzmedia.com/software/imgscalr-java-image-scaling-library/ 
            //BufferedImage out2 = Scalr.resize(in, Method.QUALITY, 300, 400); 
            //javax.imageio.ImageIO.write(out2, "JPG", new java.io.File("/home/alumne/Descargas/scaled1.jpg")); 
            
            /* Crop Image */ 
            Rectangle r = new Rectangle(100,200); 
            out = im.cropImage(in, r); 
            javax.imageio.ImageIO.write(out, "JPG", new java.io.File("/home/alumne/Descargas/juancarCrop.jpg")); 
            
            /* Convert Grey Image */ 
            out = im.greyConversion(in); 
            javax.imageio.ImageIO.write(out, "JPG", new java.io.File("/home/alumne/Descargas/juancarGrey.jpg")); 
            
                        
            
        }catch(Exception e){ 
            System.out.println(e.toString()); 
        } 
    } 
}
