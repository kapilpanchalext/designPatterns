package com.java.email.domain;

import java.io.Serializable;
import java.util.Map;
import org.springframework.http.HttpStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@JsonInclude(value = JsonInclude.Include.NON_DEFAULT)
public class HttpResponse implements Serializable {
	private static final long serialVersionUID = -57010613780621459L;

	protected String timestamp;
	protected int statusCode;
	protected HttpStatus status;
	protected String message;
	protected String developerMessage;
	protected String path;
	protected String requestMethod;
	protected Map<?, ?> data;
}
