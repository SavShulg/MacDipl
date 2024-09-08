package ru.skypro.homework.mappers;

import org.mapstruct.*;
import ru.skypro.homework.dto.AddDto;
import ru.skypro.homework.entity.Add;
import ru.skypro.homework.entity.Image;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AddMapper {
    @Mapping(source = "author.id", target = "author")
    @Mapping(source = "id", target = "pk")
    @Mapping(source = "images", target = "image", qualifiedByName = "getListOfImageLinks")
    AddDto AddToAdsDto(Add add);



    @Mapping(source = "author.firstName", target = "authorFirstName")
    @Mapping(source = "author.lastName", target = "authorLastName")
    @Mapping(source = "author.username", target = "email")
    @Mapping(source = "author.phone", target = "phone")
    @Mapping(source = "id", target = "pk")
    @Mapping(source = "images", target = "image", qualifiedByName = "getListOfImageLinks")
    Add addDtoToAdd(AddDto adsDto);

    @Named("getListOfImageLinks")
    default List<String> getListOfImageLinks(List<Image> images) {
        return (images == null || images.isEmpty()) ? null :
                images.stream().map(i -> "/image/" + i.getId()).collect(Collectors.toList());
    }
}
