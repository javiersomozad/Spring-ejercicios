package es.jsomoza.fileupload;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import lombok.Synchronized;

@Component
public class PictureToPictureCommand implements Converter<Picture, PictureCommand> {

    @Synchronized
    @Nullable
    @Override
    public PictureCommand convert(Picture picture) {
        if (picture == null) {
            return null;
        }

        final PictureCommand pictureCommand = new PictureCommand();

        pictureCommand.setId(picture.getId());
        pictureCommand.setName(picture.getName());
        pictureCommand.setContent(picture.getContent());

        return pictureCommand;
    }
}