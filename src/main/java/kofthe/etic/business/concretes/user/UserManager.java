package kofthe.etic.business.concretes.user;

import kofthe.etic.business.abstracts.user.UserService;
import kofthe.etic.business.mapping.ModelMapperService;
import kofthe.etic.core.request.user.user.CreateUserRequest;
import kofthe.etic.core.request.user.user.UpdateUserRequest;
import kofthe.etic.core.response.user.GetAllUserResponse;
import kofthe.etic.core.response.user.GetUserResponse;
import kofthe.etic.core.results.DataResult;
import kofthe.etic.core.results.Result;
import kofthe.etic.core.results.SuccessDataResult;
import kofthe.etic.repository.user.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserManager implements UserService {

    UserRepository userRepository;
    ModelMapperService modelMapperService;

    public UserManager(UserRepository userRepository, ModelMapperService modelMapperService) {
        this.userRepository = userRepository;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public DataResult<List<GetAllUserResponse>> getAll() {

        List<GetAllUserResponse> getAllUserResponseList =
                this.userRepository.findAll().stream()
                        .map(user -> this.modelMapperService.forResponse().map(user, GetAllUserResponse.class))
                        .collect(Collectors.toList());

        return new SuccessDataResult<>(getAllUserResponseList, "Listelendi");
    }

    @Override
    public DataResult<GetUserResponse> getById(int id) {
        GetUserResponse getUserResponse = this.modelMapperService.forResponse()
                .map(userRepository.findById(id), GetUserResponse.class);

        return new SuccessDataResult<>(getUserResponse, "ID'ye göre getirildi.");
    }

    @Override
    public Result<UpdateUserRequest> update(UpdateUserRequest updateUserRequest, int id) throws Exception {

        checkifUserIdExists(id);
        checkifEmailExists(updateUserRequest.getEmail());
        return null;
    }

    

    private void checkifUserIdExists(int id) throws Exception {
        if (! this.userRepository.existsById(id)) {
            throw new Exception("id bulundu.");
        }
    }

    private void checkifEmailExists(String email) throws Exception {
        if (! this.userRepository.existsByEmail(email)) {
            throw new Exception("Aynı E-Mail Olamaz.");
        }
    }


//    @Override
//    public Result update(int id, UpdateUserRequest updateUserRequest) throws BusinessException {
//
//        checkIfUserIdExists(id);
//        checkIfEmailAlreadyExists(updateUserRequest.getEmail());
//
//        User user = this.userDao.getById(id);
//
//        user.setEmail(updateUserRequest.getEmail());
//        user.setPassword(updateUserRequest.getPassword());
//
//        UserDto userDto = this.modelMapperService.forDto().map(user, UserDto.class);
//
//        return new SuccessDataResult(userDto, BusinessMessages.GlobalMessages.DATA_UPDATED_TO_NEW_DATA);
//    }
//
//    @Override
//    public Result delete(int id) throws BusinessException {
//
//        checkIfUserIdExists(id);
//
//        UserDto userDto = this.modelMapperService.forDto()
//                .map(this.userDao.getById(id), UserDto.class);
//
//        this.userDao.deleteById(id);
//
//        return new SuccessDataResult(userDto, BusinessMessages.GlobalMessages.DATA_DELETED_SUCCESSFULLY);
//    }
//
//    @Override
//    public boolean checkIfUserEmailAlreadyExists(String email) {
//        return this.userDao.existsUserByEmail(email);
//    }
//
//    private void checkIfUserIdExists(int id) throws BusinessException {
//        if (!this.userDao.existsById(id)) {
//            throw new BusinessException(BusinessMessages.UserMessages.USER_NOT_FOUND + id);
//        }
//    }
//
//    private void checkIfEmailAlreadyExists(String email) throws BusinessException {
//
//        if (this.userDao.existsUserByEmail(email)) {
//            throw new BusinessException(BusinessMessages.UserMessages.USER_EMAIL_ALREADY_EXISTS + email);
//        }
//    }
}
