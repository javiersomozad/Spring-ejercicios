package es.jsomoza.excepciones.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ProductCommand {
    private Long id;
    private String name;
    private Float price;
}