package kofthe.etic.business.abstracts.user;

import kofthe.etic.core.request.user.user.CreateUserRequest;
import kofthe.etic.core.request.user.user.UpdateUserRequest;
import kofthe.etic.core.response.user.GetAllUserResponse;
import kofthe.etic.core.response.user.GetUserResponse;
import kofthe.etic.core.results.DataResult;
import kofthe.etic.core.results.Result;

import java.util.List;

public interface UserService {


    DataResult<List<GetAllUserResponse>> getAll();

    DataResult<GetUserResponse> getById(int id);


    Result<UpdateUserRequest> update(UpdateUserRequest updateUserRequest, int id) throws Exception;
}
