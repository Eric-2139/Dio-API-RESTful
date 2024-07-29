package dio.spring_boot.service;

import dio.spring_boot.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
