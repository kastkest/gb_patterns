package com.github.kastkest.gb.patterns.lesson_2.domain;

import java.util.Map;

public class HttpRequest {
    private String method;
    private String url;
    private Map<String, String> headers;
    private String body;

    private HttpRequest() {
    }

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }

    public static class Builder {

        private HttpRequest httpRequest;

        private Builder() {
            this.httpRequest = new HttpRequest();
        }

        public static Builder createBuilder() {
            return new Builder();
        }

        public Builder withMethod(String method) {
            this.httpRequest.method = method;
            return this;
        }

        public Builder withUrl(String url) {
            this.httpRequest.url = url;
            return this;
        }

        public Builder withHeaders(Map<String, String> headers) {
            this.httpRequest.headers = headers;
            return this;
        }

        public Builder withBody(String body) {
            this.httpRequest.body = body;
            return this;
        }

        public HttpRequest build() {
            return this.httpRequest;
        }

    }

}
