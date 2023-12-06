package es.jsomoza.i18nvalidation.commands;

import java.util.Date;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class OrderCommand {
	
	private Long id;
    
    @NotBlank
    @Size(min = 3, max = 255)
    private String description;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    private Date date;
    
    @Min(1)
    @Max(1000)
    private Double total;
}
