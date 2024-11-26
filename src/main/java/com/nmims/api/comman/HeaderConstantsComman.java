package com.nmims.api.comman;

import com.google.common.net.HttpHeaders;

public class HeaderConstantsComman {

    // Common HTTP Headers
    public static final String ACCEPT = "Accept";
    public static final String ACCEPT_CHARSET = "Accept-Charset";
    public static final String ACCEPT_ENCODING = "Accept-Encoding";
    public static final String ACCEPT_LANGUAGE = "Accept-Language";
    public static final String AUTHORIZATION = "Authorization";
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String COOKIE = "Cookie";
    public static final String SET_COOKIE = "Set-Cookie";
    public static final String CONNECTION = "Connection";
    public static final String HOST = "Host";
    public static final String USER_AGENT = "User-Agent";

    // CORS (Cross-Origin Resource Sharing) Headers
    public static final String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
    public static final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
    public static final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
    public static final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
    public static final String ACCESS_CONTROL_MAX_AGE = "Access-Control-Max-Age";
    public static final String ACCESS_CONTROL_REQUEST_HEADERS = "Access-Control-Request-Headers";
    public static final String ACCESS_CONTROL_REQUEST_METHOD = "Access-Control-Request-Method";

    // Content Headers
    public static final String CONTENT_DISPOSITION = "Content-Disposition";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_LANGUAGE = "Content-Language";
    public static final String CONTENT_LOCATION = "Content-Location";
    public static final String CONTENT_RANGE = "Content-Range";

    // Security Headers
    public static final String STRICT_TRANSPORT_SECURITY = "Strict-Transport-Security";
    public static final String X_CONTENT_TYPE_OPTIONS = "X-Content-Type-Options";
    public static final String X_FRAME_OPTIONS = "X-Frame-Options";
    public static final String X_XSS_PROTECTION = "X-XSS-Protection";
    public static final String REFERRER_POLICY = "Referrer-Policy";
    public static final String PERMISSIONS_POLICY = "Permissions-Policy";

    // Custom Headers
    public static final String X_CUSTOM_HEADER = "X-Custom-Header";
    public static final String X_REQUEST_ID = "X-Request-ID";
    public static final String X_CORRELATION_ID = "X-Correlation-ID";

    // Other Common Headers
    public static final String DATE = "Date";
    public static final String ETAG = "ETag";
    public static final String LAST_MODIFIED = "Last-Modified";
    public static final String LOCATION = "Location";
    public static final String RANGE = "Range";
    public static final String UPGRADE = "Upgrade";
    public static final String VIA = "Via";
    public static final String WARNING = "Warning";
    
    HttpHeaders

    // Prevent instantiation
    private HeaderConstantsComman() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
