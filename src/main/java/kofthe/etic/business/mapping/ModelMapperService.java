package kofthe.etic.business.mapping;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {

    ModelMapper forDTO();

    ModelMapper forResponse();

    ModelMapper forRequest();

}
