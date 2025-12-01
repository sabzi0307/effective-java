package edu.sabzi.sample.item2;


import java.util.HashMap;
import java.util.Map;

/**
 * A simplified HTTP request builder to demonstrate:
 * - Map aggregation
 * - Fluent API design
 * - Immutable request object
 */
public final class HttpRequest {

    private final String url;
    private final String method;
    private final Map<String, String> headers;
    private final String body;

    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = Map.copyOf(builder.headers);
        this.body = builder.body;
    }

    public static class Builder {

        private final String url;
        private String method = "GET";
        private final Map<String, String> headers = new HashMap<>();
        private String body = "";

        public Builder(String url) {
            this.url = url;
        }

        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public Builder header(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }

    @Override
    public String toString() {
        return method + " " + url + " headers=" + headers + " body=" + body;
    }
}

