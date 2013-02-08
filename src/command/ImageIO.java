package command;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.swing.ImageIcon;

/**
 * 
 * @author Fabio Issamu Oshiro
 */
public class ImageIO {
	static ImageIO imgIo = new ImageIO();

	public static BufferedImage read(File arq) {
		String imgName = arq.getPath();
		try {
			BufferedImage retorno = null;
			URL url = null;
			String parentPath = "";
			for (int i = 0; i < 10; i++) {
				url = imgIo.getClass().getResource(
						parentPath + imgName.replace("\\", "/"));
				if (url != null)
					break;
				url = imgIo.getClass().getResource(
						(parentPath + imgName).replace("/", "\\"));
				if (url != null)
					break;
				parentPath += "../";
			}
			if (url == null)
				System.out.println("url null");
			ImageIcon imgIcon = new ImageIcon(url);

			retorno = new BufferedImage(imgIcon.getIconWidth(),
					imgIcon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
			retorno.getGraphics().drawImage(imgIcon.getImage(), 0, 0, null);
			return retorno;
		} catch (Exception e) {
			System.out.println("Erro ao abrir a imagem jar " + imgName);
		}
		try {
			return javax.imageio.ImageIO.read(arq);
		} catch (Exception e) {
			System.out.println("Erro ao abrir a imagem " + imgName);
		}
		return null;
	}
}
