package util;

import java.util.Map;
import java.util.logging.Handler;

public class HttpUtil {
    private static final HttpUtil ourInstance = new HttpUtil();
    private android.os.Handler mHandler;

    public static HttpUtil getInstance(){
        return ourInstance;
    }

    private HttpUtil(){
        mHandler = new android.os.Handler();
    }

    //post 请求数据


    }

