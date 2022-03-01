package com.co.kafkapoc.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.co.kafkapoc.util.KafkaJsonSchemaJacksonUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TestTypesDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -680996837223788859L;

	@JsonProperty(required = false)
	private String stringNotRequired;

	@JsonProperty(required = true)
	private String stringRequired;

	@JsonProperty(required = false)
	private Boolean booleanNotRequired;

	@JsonProperty(required = true)
	private Boolean booleanRequired;

	@JsonProperty(required = false)
	private Double numberNotRequired;

	@JsonProperty(required = true)
	private Double numberRequired;

	@JsonProperty(required = false)
	private Integer integerNotRequired;

	@JsonProperty(required = true)
	private Integer integerRequired;

	@JsonProperty(required = false)
	private List<Integer> arrayNotRequired;

	@JsonProperty(required = true)
	private List<Integer> arrayRequired;

	@JsonProperty(required = false)
	@JsonSerialize(using = KafkaJsonSchemaJacksonUtil.LocalDateTimeSerializer.class)
	@JsonDeserialize(using = KafkaJsonSchemaJacksonUtil.LocalDateTimeDeserializer.class)
	private LocalDateTime dateNotRequired;

	@JsonProperty(required = true)
	@JsonSerialize(using = KafkaJsonSchemaJacksonUtil.LocalDateTimeSerializer.class)
	@JsonDeserialize(using = KafkaJsonSchemaJacksonUtil.LocalDateTimeDeserializer.class)
	private LocalDateTime dateRequired;

}
