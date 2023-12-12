import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
public class Creator {



    public static void main(String[] args) {
        int width = 500;
        int height = 500;
        String text = "Hello, world";
        String QR_CODE_IMAGE_PATH = "C:\\Users\\Greshnick\\Desktop";
        try {
            Map<EncodeHintType, Object> hintMap = new HashMap<>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height, hintMap);

            Path path = FileSystems.getDefault().getPath(QR_CODE_IMAGE_PATH);

            MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path); // Сохранение QR-кода в формате PNG

            System.out.println("QR Code generated successfully at path: " + QR_CODE_IMAGE_PATH);
        } catch (WriterException | IOException e) {
            System.err.println("Could not generate QR Code: " + e.getMessage());
        }
    }

}
