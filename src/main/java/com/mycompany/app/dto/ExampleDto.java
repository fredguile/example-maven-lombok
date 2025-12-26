package com.mycompany.app.dto;

import lombok.Builder;
import lombok.NonNull;

@Builder
public class ExampleDto {
	@NonNull
	String identifier;
	String name;

	public static ExampleDto fromIdentifier(final String identifier) {
		return ExampleDto.builder().identifier(identifier).build();
	}
}
