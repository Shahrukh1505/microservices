package com.lcwd.user.service.payload;

import org.springframework.http.HttpStatus;

import lombok.*;


@Getter

@Setter

@AllArgsConstructor

@NoArgsConstructor

@Builder

public class ApiResponse {
	private String message;
	private boolean success;
	private HttpStatus status;
	// Builder pattern implementation
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String message;
        private boolean success;
        private HttpStatus status;

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder status(HttpStatus status) {
            this.status = status;
            return this;
        }

        public ApiResponse build() {
            ApiResponse response = new ApiResponse();
            response.message = this.message;
            response.success = this.success;
            response.status = this.status;
            return response;
        }
    }
	

}
