package es.jsomoza.fileupload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PictureCommand {
    private Long id;
    private String name;
    private Byte[] content;
}