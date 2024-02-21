package ivlev.ivlevback.utils;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;

import java.util.*;

public class CloudinaryUtil {
    private static Cloudinary cloudinary;

    @Value("${cloud_name}")
    private static String cloudName;

    @Value("${api_key}")
    private static String apiKey;

    @Value("${api_secret}")
    private static String apiSecret;

    public static Cloudinary getInstance() {
        if (cloudinary == null) {
            Map<String, String> configMap = new HashMap<>();
            configMap.put("cloud_name", cloudName);
            configMap.put("api_key", apiKey);
            configMap.put("api_secret", apiSecret);
            cloudinary = new Cloudinary(configMap);
        }
        return cloudinary;
    }
}
