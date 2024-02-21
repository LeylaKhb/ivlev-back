package ivlev.ivlevback.utils;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CloudinaryUtil {
    private static Cloudinary cloudinary;


    public static Cloudinary getInstance() {
        if (cloudinary == null) {
            Map<String, String> configMap = new HashMap<>();
            configMap.put("cloud_name", "dphkmjgiy");
            configMap.put("api_key", "437352785774432");
            configMap.put("api_secret", "6rhJZtcDoaoopGNV8K46yv2WmKc");
            cloudinary = new Cloudinary(configMap);
        }
        return cloudinary;
    }
}
